import java.util.List;
import java.util.Scanner;

public abstract class Jugador {
    String nombre;
    String apellidos;
    double notaMedia;

    float minutosJugadosMedios;
    float porcentajePasesPrecisos;

    boolean titular;

    public Jugador(){

    }

    public Jugador(String nombre, String apellidos, double notaMedia,float minutosJugadosMedios, float porcentajePasesPrecisos){
        this.nombre = nombre;
        this.apellidos= apellidos;
        this.notaMedia = notaMedia;
        this.minutosJugadosMedios = minutosJugadosMedios;
        this.porcentajePasesPrecisos =porcentajePasesPrecisos;

    }

    public Jugador(String[] splitSttring){
        int x =1;
        this.nombre = splitSttring[x++];
        this.apellidos = splitSttring[x++];
        this.notaMedia = Double.parseDouble(splitSttring[x++]);
        this.minutosJugadosMedios = Float.parseFloat(splitSttring[x++]);
        this.porcentajePasesPrecisos = Float.parseFloat(splitSttring[x++]);
        if(splitSttring[x++].equals("Si")){
            titular = true;
        }else if(splitSttring[x++].equals("No")){
            titular = false;
        }
    }
    @Override
    public String toString(){
        return nombre + " " + apellidos + " Nota media: " + notaMedia + " Minutos jugados " + minutosJugadosMedios + " Porcentaje pases: " + porcentajePasesPrecisos;
    }
    public abstract void mostrar();

    public abstract double calcularNotaMedia();
}
