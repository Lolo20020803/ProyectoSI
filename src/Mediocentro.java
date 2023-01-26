public class Mediocentro extends Jugador{

    private int regatesRealizados;

    private int regatesConExito;

    private int recuperaciones;

    private int asistencias;

    private int goles;

    public Mediocentro(){

    }

    public Mediocentro(int tiempoEnClubActual, String nombre, String apellidos, double notaMedia,float minutosJugadosMedios,float porcentajePasesPrecisos, int regatesRealizados, int regatesConExito, int recuperaciones, int asistencias, int goles){
        super(tiempoEnClubActual,nombre,apellidos,notaMedia,minutosJugadosMedios,porcentajePasesPrecisos);
        this.regatesRealizados =regatesRealizados;
        this.regatesConExito = regatesConExito;
        this.recuperaciones=recuperaciones;
        this.asistencias=asistencias;
        this.goles=goles;
    }
}
