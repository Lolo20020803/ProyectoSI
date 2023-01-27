import javax.sound.sampled.Port;
import java.util.Scanner;

public class Portero extends Jugador{
    private int paradas;
    private int golesEncajados;
    private int penaltisParados;
    private int penaltisEncajados;

    public Portero(){

    }

    public Portero(int tiempoEnClubActual, String nombre, String apellidos, double notaMedia,float minutosJugadosMedios, float procetajePasesPrecisos,int paradas, int golesEncajados, int penaltisParados, int penaltisEncajados){
        super(tiempoEnClubActual,nombre,apellidos,notaMedia,minutosJugadosMedios,procetajePasesPrecisos);
        this.paradas = paradas;
        this.golesEncajados = golesEncajados;
        this.penaltisParados = penaltisParados;
        this.penaltisEncajados = penaltisEncajados;
    }

    public Portero(Scanner scanner){
        super(scanner);
        this.paradas = Integer.parseInt(scanner.next());
        this.golesEncajados = Integer.parseInt(scanner.next());
        this.penaltisParados =Integer.parseInt(scanner.next());
        this.penaltisEncajados = Integer.parseInt(scanner.next());
    }

    @Override
    public void mostrar() {
        System.out.printf(toString() + " Paradas :" +paradas + " Goles Encajados: " +golesEncajados + " Penaltis Parados: " + penaltisParados + " Penaltis Encajados: " + penaltisEncajados);
    }

}
