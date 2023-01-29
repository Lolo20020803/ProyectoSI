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
        Equipo equipo1 = new Equipo("Equipo 1", "D:\\ProgramoCosas\\ProyectoSI\\ficheros\\prueba.csv");
        Equipo equipo2 = new Equipo( "Equipo 2","D:\\ProgramoCosas\\ProyectoSI\\ficheros\\prueba2.csv");
        numEquipos = 2;
        partidos.add(new Partido(equipo1,equipo2));
        partidos.add(new Partido(equipo2,equipo1));
        equipo1.crearPartidos(partidos);

    }
    public void evolucionar(){
        int generacion = 0;
        Equipo eTemp = null;
        while (generacion <= numGeneraciones){
           /* for (Equipo equipo1: equipos) {
                for (Equipo equipo2: equipos) {
                    if(!equipo1.equals(equipo2)){
                        if(r.nextFloat(1)<=prob){
                            equipo1.invertir(equipo2);
                            System.out.println("Invierte");
                        }
                        if(r.nextFloat(1)<=probMut){
                            System.out.println("Intercambia");
                            equipo1.intercambiar(equipo2);
                        }
                    }
                }
                equipo1.simular();
                mostrarResultados();
            }
            */
            for(int x =0;x<equipos.size()-1;x++){
                Equipo equipo1 = equipos.get(x);
                Equipo equipo2 = equipos.get(x+1);
                if(r.nextFloat(1)<=prob){
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
            }
        }
    }
    public void mostrarResultados(){
        for(Equipo equipo : equipos){
            System.out.println(equipo.nombre + " Puntos: " + equipo.puntos);
        }
        //System.out.println("El ganador de la liga es: " + equipos.get(mayor()).nombre);
    }
    public int mayor(){
        int res =0;
        for (Equipo equipo: equipos) {
            if(equipo.puntos >res){
                res = equipo.puntos;
            }
        }
        for (Equipo equipo : equipos){
            if(equipo.puntos == res){
                return equipo.plantilla.indexOf(equipo);
            }
        }
        return res;
    }
}
