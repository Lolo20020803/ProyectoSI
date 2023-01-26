import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jugador extends Trayectoria{
    String nombre;
    String apellidos;
    double notaMedia;
    List<String> trofeosIndividuales;
    //No meto la lista de trofeos en el constructor por si queremos
    // añadirlos de otra forma
    float minutosJugadosMedios;
    float procetajePasesPrecisos;

    public Jugador(){

    }

    public Jugador(int tiempoEnClubActual, String nombre, String apellidos, double notaMedia,float minutosJugadosMedios, float procetajePasesPrecisos){
        super(tiempoEnClubActual);
        this.nombre = nombre;
        this.apellidos= apellidos;
        this.notaMedia = notaMedia;
        this.minutosJugadosMedios = minutosJugadosMedios;
        this.procetajePasesPrecisos =procetajePasesPrecisos;
    }



}
