import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    String nombre;
    List<Jugador> plantilla;
    double notaMedia;
    int puntos;
    ArrayList<Partido> partidos;
    public Equipo (String nombre,String ruta){
        this.nombre = nombre;
        this.partidos = partidos;
        this.plantilla = new ArrayList<Jugador>();
        try {
            CSVReader csvReader = new CSVReader(new FileReader(ruta));
            String[] fila = null;
            while ((fila = csvReader.readNext()) != null){
                switch (fila[0]){
                     case "Portero": Portero provisionalPort = new Portero(fila); plantilla.add(provisionalPort);break;
                     case "Defensa": Defensa provisionalDef = new Defensa(fila); plantilla.add(provisionalDef);break;
                     case "Mediocentro": Mediocentro provisionalMed = new Mediocentro(fila); plantilla.add(provisionalMed);break;
                     case "Delantero": Delantero provisionalDel = new Delantero(fila); plantilla.add(provisionalDel);break;
             }
            }
        } catch (CsvValidationException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void crearPartidos(ArrayList<Partido> partidos){
        this.partidos = partidos;
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
    //En nuestro proyecto hemos planteado que la opcion de invertir sea que el rival pase de ser local a visitante
    public void invertir(Equipo rival){
        int x =0;
        for (Partido partido : partidos){
            if(partido.partidoExacto(this,rival)){
                partidos.set(x,new Partido(rival,this));
            }
            x++;
        }
    }
    //En nuestro proyecto hemos pensado que una de las posibilidades de intercambiar el cromosoma fuera que el resultado fuera totalmente modificado y que siempre el equipo local perdiera el encuentro
    public void intercambiar(Equipo rival){
        for (Partido partido : partidos){
            if(partido.partidoExacto(this,rival)){
                partido.modificar();
            }
        }
    }

    public void simular(){
        for(Partido partido:partidos){
            partido.simular();
        }
    }

}
