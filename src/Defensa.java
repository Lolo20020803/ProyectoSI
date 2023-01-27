import java.util.Scanner;

public class Defensa extends Jugador{

    private int regates_Rec;

    private int intercepciones;

    private int robos;

    public Defensa(){

    }

    public Defensa(int tiempoEnClubActual, String nombre, String apellidos, double notaMedia,float minutosJugadosMedios, float procetajePasesPrecisos,int regates_Rec, int intercepciones, int robos){
        super(tiempoEnClubActual,nombre,apellidos,notaMedia,minutosJugadosMedios,procetajePasesPrecisos);
        this.regates_Rec= regates_Rec;
        this.intercepciones = intercepciones;
        this.robos = robos;
    }

    public Defensa(Scanner scanner){
        super(scanner);
        this.regates_Rec = Integer.parseInt(scanner.next());
        this.intercepciones = Integer.parseInt(scanner.next());
        this.robos = Integer.parseInt(scanner.next());
    }

    @Override
    public void mostrar() {
        System.out.printf(toString() + "Regates Recibidos: "+regates_Rec+" Intercepciones: "+intercepciones+" Robos: "+robos);
    }
}
