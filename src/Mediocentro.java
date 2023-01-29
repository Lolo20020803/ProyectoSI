import java.util.Scanner;

public class Mediocentro extends Jugador{

    private int regatesRealizados;

    private int regatesConExito;

    private int recuperaciones;

    private int asistencias;

    private int goles;

    public Mediocentro(){

    }

    public Mediocentro(int tiempoEnClubActual, String nombre, String apellidos, double notaMedia,float minutosJugadosMedios,float porcentajePasesPrecisos, int regatesRealizados, int regatesConExito, int recuperaciones, int asistencias, int goles){
        //super(tiempoEnClubActual,nombre,apellidos,notaMedia,minutosJugadosMedios,porcentajePasesPrecisos);
        this.regatesRealizados =regatesRealizados;
        this.regatesConExito = regatesConExito;
        this.recuperaciones=recuperaciones;
        this.asistencias=asistencias;
        this.goles=goles;
    }
    public Mediocentro(String[] splitString){
        super(splitString);
        int x = 7;
        this.regatesRealizados = Integer.parseInt(splitString[x++]);;
        this.regatesConExito = Integer.parseInt(splitString[x++]);;
        this.recuperaciones= Integer.parseInt(splitString[x++]);;
        this.asistencias= Integer.parseInt(splitString[x++]);;
        this.goles= Integer.parseInt(splitString[x++]);;
    }



    @Override
    public void mostrar() {
        System.out.printf(toString() + " Regates Realizados: "+ regatesRealizados+" Regates Con Exito: "+regatesConExito+" Recuperaciones: "+recuperaciones+" Asistencias: "+asistencias+" Goles: "+goles);
    }

    @Override
    public double calcularNotaMedia() {
        double puntuacion;
        double porcentajeRegates;
        if(!super.titular){
            puntuacion = 25;
        }
        else{
            puntuacion = 35;
        }
        porcentajeRegates = regatesConExito/regatesRealizados;
        puntuacion+=(porcentajeRegates*0.3)+(recuperaciones*3)+(asistencias*2)+(goles*5)+(porcentajePasesPrecisos*0.1);
        if(puntuacion>=100){
            puntuacion = 100;
        }
        return puntuacion/10;
    }
}
