public class Portero extends Jugador{
    int paradas;
    int golesEncajados;
    int penaltisParados;
    int penaltisEncajados;

    public Portero(){

    }

    public Portero(int tiempoEnClubActual, String nombre, String apellidos, double notaMedia,float minutosJugadosMedios, float procetajePasesPrecisos,int paradas, int golesEncajados, int penaltisParados, int penaltisEncajados){
        super(tiempoEnClubActual,nombre,apellidos,notaMedia,minutosJugadosMedios,procetajePasesPrecisos);
        this.paradas = paradas;
        this.golesEncajados = golesEncajados;
        this.penaltisParados = penaltisParados;
        this.penaltisEncajados = penaltisEncajados;
    }

}
