public class Delantero extends Jugador{

    int golesMarcados;

    int penaltisTirados;

    int penaltisMarcados;

    int tirosAPuerta;

    double tirosTotales;

    public Delantero(){

    }

    public Delantero(int tiempoEnClubActual, String nombre, String apellidos, double notaMedia,float minutosJugadosMedios, float procetajePasesPrecisos,int golesMarcados, int penaltisTirados, int penaltisMarcados, int tirosAPuerta,double tirosTotales){
        super(tiempoEnClubActual,nombre,apellidos,notaMedia,minutosJugadosMedios,procetajePasesPrecisos);
        this.golesMarcados = golesMarcados;
        this.penaltisTirados = penaltisTirados;
        this.penaltisMarcados = penaltisMarcados;
        this.tirosAPuerta = tirosAPuerta;
        this.tirosTotales = tirosTotales;
    }
}
