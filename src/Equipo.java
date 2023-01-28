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
    private int puntos;

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

    public void mostrar(){
        for(Jugador jugador : plantilla){
            jugador.mostrar();
        }
    }
    public double calcularEquipo(){
        double res = 0;
        for(Jugador jugador: plantilla){
            res += jugador.calcularNotaMedia();
        }
        return res / plantilla.size();
    }
}
