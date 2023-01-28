import java.util.ArrayList;
import java.util.Random;

public class Liga {
    private ArrayList<Equipo> equipos;
    private int numEquipos = 0;
    private int numGeneraciones = 0;
    private float prob = 0.0F;
    private float probMut =0.0F;
    static private Random r = new Random();
    public Liga(){
        equipos.add(new Equipo( "../ficheros/pruebas.csv"));
        equipos.add(new Equipo( "../ficheros/pruebas.csv"));
    }

}
