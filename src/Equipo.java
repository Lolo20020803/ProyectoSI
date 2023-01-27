import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Equipo {
    String nombre;
    List<String> trofeosEquipo;
    Racha ultimosJugados;
    List<Jugador> plantilla;
    Entrenador entrenador;

    /*
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
    */
    public Equipo (String ruta){
        this.plantilla = new ArrayList<Jugador>();
        try {
            CSVReader csvReader = new CSVReader(new FileReader(ruta));
            String[] fila = null;
            while ((fila = csvReader.readNext()) != null){
                switch (fila[0]){
                     case "Portero": Portero provisionalPort = new Portero(); plantilla.add(provisionalPort);break;
                     case "Defensa": Defensa provisionalDef = new Defensa(); plantilla.add(provisionalDef);break;
                     case "Mediocentro": Mediocentro provisionalMed = new Mediocentro(); plantilla.add(provisionalMed);break;
                     case "Delantero": Delantero provisionalDel = new Delantero(fila); plantilla.add(provisionalDel);break;
                     case "Entrenador":this.entrenador = new Entrenador();break;
             }
            }
        } catch (CsvValidationException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void replaceSpaces (String[] string){
        for (String hueco: string) {
            hueco.replace(" ", "");
        }
    }
    public void mostrar(){
        for(Jugador jugador : plantilla){
            jugador.mostrar();
        }
    }
}
