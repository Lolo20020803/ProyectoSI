import java.util.Scanner;

public class Delantero extends Jugador{

    int golesMarcados;

    int penaltisTirados;

    int penaltisMarcados;

    int tirosAPuerta;

    int tirosTotales;

    public Delantero(){

    }

    public Delantero(int tiempoEnClubActual, String nombre, String apellidos, double notaMedia,float minutosJugadosMedios, float procetajePasesPrecisos,int golesMarcados, int penaltisTirados, int penaltisMarcados, int tirosAPuerta,int tirosTotales){
        //super(tiempoEnClubActual,nombre,apellidos,notaMedia,minutosJugadosMedios,procetajePasesPrecisos);
        this.golesMarcados = golesMarcados;
        this.penaltisTirados = penaltisTirados;
        this.penaltisMarcados = penaltisMarcados;
        this.tirosAPuerta = tirosAPuerta;
        this.tirosTotales = tirosTotales;
    }

    public Delantero (String[] splitString){
        super(splitString);
        int x = 6;
        this.golesMarcados = Integer.parseInt(splitString[x++]);
        this.penaltisTirados = Integer.parseInt(splitString[x++]);
        this.penaltisMarcados = Integer.parseInt(splitString[x++]);
        this.tirosAPuerta = Integer.parseInt(splitString[x++]);
        this.tirosTotales = Integer.parseInt(splitString[x++]);
    }
    public void mostrar(){
        System.out.printf(toString() + " Goles Marcados: " +golesMarcados + " Penaltis Marcados: " +penaltisMarcados + " Penaltis Tirados: " +penaltisTirados + " Tiros Totales: " + tirosTotales + " Tiros a puerta: " + tirosAPuerta +" Tiros Totales: " +tirosTotales);
    }

    @Override
    public void calcularNotaMedia() {

    }
}
