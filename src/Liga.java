import java.util.ArrayList;
import java.util.Random;

public class Liga {
    private ArrayList<Equipo> equipos;
    private int numEquipos = 0;
    private int numGeneraciones = 2;
    private float prob = 0.7F;
    private float probMut =0.05F;
    static private Random r = new Random();
    public Liga(){
        equipos = new ArrayList<Equipo>();
        ArrayList<Partido> partidos = new ArrayList<Partido>();
        Equipo equipo1 = new Equipo("Barcelona", "ficheros/Barcelona.csv");
        Equipo equipo2 = new Equipo( "Getafe","ficheros/Getafe.csv");
        Equipo equipo3 = new Equipo( "Atletico De Madrid","ficheros/Atletico_de_Madrid.csv");
        Equipo equipo4 = new Equipo( "Real Madrid","ficheros/Real_Madrid.csv");
        Equipo equipo5 = new Equipo( "Real Sociedad","ficheros/Real_Sociedad.csv");
        equipos.add(equipo1);
        equipos.add(equipo2);
        equipos.add(equipo3);
        equipos.add(equipo4);
        equipos.add(equipo5);
        numEquipos = 5;
        equipo1.crearPartidos(crearPartidos(equipo1));
        equipo2.crearPartidos(crearPartidos(equipo2));
        equipo3.crearPartidos(crearPartidos(equipo3));
        equipo4.crearPartidos(crearPartidos(equipo4));
        equipo5.crearPartidos(crearPartidos(equipo5));
    }
    public ArrayList<Partido> crearPartidos(Equipo equipo){
        ArrayList<Partido> resultado = new ArrayList<Partido>();
        for(Equipo prov : equipos){
            if(!prov.equals(equipo)){
                resultado.add(new Partido(equipo,prov));
            }
        }
        return resultado;
    }
    public void evolucionar(){
        int generacion = 0;
        Equipo eTemp = null;
        while (generacion <= numGeneraciones){
            for(int x =0;x<equipos.size()-1;x++){
                System.out.println("-------------------La liga-------------------");
                Equipo equipo1 = equipos.get(x);
                Equipo equipo2 = equipos.get(x+1);
                if(r.nextFloat()<=prob){
                    equipo1.invertir(equipo2);
                    System.out.println("Invierte");
                }
                if(r.nextFloat(1)<=probMut){
                    System.out.println("Intercambia");
                    equipo1.intercambiar(equipo2);
                }
                equipo1.simular();
                mostrarResultados();
                generacion++;
                puntosA0();
            }
        }
    }
    public void puntosA0(){
        for(Equipo equipo:equipos){
            equipo.puntos =0;
        }
    }
    public void mostrarResultados(){
        for(Equipo equipo : equipos){
            System.out.println(equipo.nombre + " Puntos: " + equipo.puntos);
        }
        ganador();
    }
    public void ganador(){
        Equipo ganador = equipos.get(0);
        for (Equipo equipo: equipos) {
            if(equipo.puntos > ganador.puntos){
                ganador = equipo;
            }
        }
        System.out.println("El ganador de la liga es: " + ganador.nombre);
    }
}
