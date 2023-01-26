public class Fecha {

    int Dia;

    int Mes;

    int Anio;

    int hora;

    int minutos;

    public Fecha(int Dia, int Mes, int Anio, int hora, int minutos){
        this.Dia = Dia;
        this.Mes = Mes;
        this.Anio = Anio;
        this.hora= hora;
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "Dia del partido: " + Dia +"/"+Mes+"/"+Anio+" Hora del partido: "+hora+":"+minutos;
    }
}
