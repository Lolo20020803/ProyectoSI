import java.util.List;
public class Trayectoria {

    List<Equipo> equipos;
    //No meto la lista de equipos en el constructor por si queremos
    // añadir los equipos en los que han estado de otra forma
    int tiempoEnClubActual;

    public Trayectoria(){

    }
    public Trayectoria(int tiempoEnClubActual){
        this.tiempoEnClubActual = tiempoEnClubActual;
    }
}
