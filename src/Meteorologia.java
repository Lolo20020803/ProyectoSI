public class Meteorologia {

    Fecha fechaPartido;

    float temperatura;

    String tiempo;// Ejemplo: Si esta nublado, soleado, lloviendo...//

    public Meteorologia(Fecha fechaPartido, float temperatura, String tiempo){
        this.fechaPartido = fechaPartido;
        this.temperatura = temperatura;
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return fechaPartido+"\nTemperatura: "+temperatura+"ºC\nClima: "+tiempo;
    }
}
