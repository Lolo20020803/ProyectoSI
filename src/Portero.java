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
        //super(tiempoEnClubActual,nombre,apellidos,notaMedia,minutosJugadosMedios,procetajePasesPrecisos);
        this.paradas = paradas;
        this.golesEncajados = golesEncajados;
        this.penaltisParados = penaltisParados;
        this.penaltisEncajados = penaltisEncajados;
    }


    @Override
    public void mostrar() {
        System.out.printf(toString() + " Paradas :" +paradas + " Goles Encajados: " +golesEncajados + " Penaltis Parados: " + penaltisParados + " Penaltis Encajados: " + penaltisEncajados);
    }

    @Override
    public void calcularNotaMedia() {
        double puntuacion;
        if(!super.titular){
            puntuacion = 25;
        }
        else{
            puntuacion = 35;
        }
        puntuacion+=(paradas*1)+(golesEncajados*(-2))+(penaltisParados*3)+(penaltisEncajados*(-2));
        if(puntuacion>=100){
            puntuacion = 100;
        }
        super.notaMedia = puntuacion/10;
    }
}
