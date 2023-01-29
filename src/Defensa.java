import java.util.Scanner;

public class Defensa extends Jugador{

    private int regates_Rec;

    private int intercepciones;

    private int faltas;

    public Defensa(){

    }

    public Defensa(int tiempoEnClubActual, String nombre, String apellidos, double notaMedia,float minutosJugadosMedios, float procetajePasesPrecisos,int regates_Rec, int intercepciones, int faltas){
        //super(tiempoEnClubActual,nombre,apellidos,notaMedia,minutosJugadosMedios,procetajePasesPrecisos);
        this.regates_Rec= regates_Rec;
        this.intercepciones = intercepciones;
        this.faltas = faltas;
    }
    public Defensa(String[] splitString){
        super(splitString);
        int x = 7;
        this.regates_Rec = Integer.parseInt(splitString[x++]);;
        this.intercepciones = Integer.parseInt(splitString[x++]);;
        this.faltas = Integer.parseInt(splitString[x++]);;
    }

    @Override
    public void mostrar() {
        System.out.printf(toString() + "Regates Recibidos: "+regates_Rec+" Intercepciones: "+intercepciones+" Faltas: "+faltas);
    }

    @Override
    public double calcularNotaMedia() {
        double puntuacion;
        if(!super.titular){
            puntuacion = 25;
        }
        else{
            puntuacion = 35;
        }

        puntuacion+=(regates_Rec*(-0.5))+(intercepciones*3)+(faltas*(-3))+(porcentajePasesPrecisos*0.1);
        if(puntuacion>=100){
            puntuacion = 100;
        }
        return puntuacion/10;
    }
}
