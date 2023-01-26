import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Equipo {
    String nombre;
    List<String> trofeosEquipo;
    Racha ultimosJugados;
    List<Jugador> plantilla;
    Entrenador entrenador;


    public Equipo (String rutaFichero){
        try{
            Scanner sc = new Scanner(new File(rutaFichero));
            sc.useDelimiter(",");
            plantilla = new ArrayList<Jugador>();
            while (sc.hasNext()){
                switch (sc.next()){
                    case "Portero": Portero provisionalPort = new Portero(); plantilla.add(provisionalPort);break;
                    case "Defensa": Defensa provisionalDef = new Defensa(); plantilla.add(provisionalDef);break;
                    case "Mediocentro": Mediocentro provisionalMed = new Mediocentro(); plantilla.add(provisionalMed);break;
                    case "Delantero": Delantero provisionalDel = new Delantero(sc); plantilla.add(provisionalDel);break;
                    case "Entrenador": Entrenador provisionalEntr = new Entrenador(); this.entrenador = provisionalEntr;break;
                }
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public void mostrar(){
        for(Jugador jugador : plantilla){
            jugador.mostrar();
        }
    }
}
