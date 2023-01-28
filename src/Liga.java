import java.util.ArrayList;
import java.util.Random;

public class Liga {
    private ArrayList<Equipo> equipos;
    private int numEquipos = equipos.size();
    private int numGeneraciones = 0;
    private float prob = 0.0F;
    private float probMut =0.0F;
    static private Random r = new Random();
    public Liga(){
        equipos.add(new Equipo( "../ficheros/pruebas.csv"));
        equipos.add(new Equipo( "../ficheros/pruebas.csv"));
    }
    public void evolucionar(){
        int generacion = 0;
        Equipo eTemp = null;
        while (generacion <= numGeneraciones){
            for (Equipo equipo1: equipos) {
                for (Equipo equipo2: equipos) {
                    if(!equipo1.equals(equipo2)){
                        if(r.nextFloat()<=prob){
                            equipo1.invertir(equipo2);
                        }

                        if(r.nextFloat()<=probMut){
                            equipo1.intercambiar(equipo2);
                        }
                    }
                }
                equipo1.simular();
            }
        }
    }
}
