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
    float porcentajePasesPrecisos;

    public Jugador(){

    }

    public Jugador(int tiempoEnClubActual, String nombre, String apellidos, double notaMedia,float minutosJugadosMedios, float porcentajePasesPrecisos){
        super(tiempoEnClubActual);
        this.nombre = nombre;
        this.apellidos= apellidos;
        this.notaMedia = notaMedia;
        this.minutosJugadosMedios = minutosJugadosMedios;
        this.porcentajePasesPrecisos =porcentajePasesPrecisos;
    }
    public Jugador(Scanner scanner){
        super(Integer.parseInt(scanner.next()));
        this.nombre = scanner.next();
        this.apellidos = scanner.next();
        this.notaMedia = Integer.parseInt(scanner.next());
        this.minutosJugadosMedios = Float.parseFloat(scanner.next());
        this.porcentajePasesPrecisos = Float.parseFloat(scanner.next());
    }


}
