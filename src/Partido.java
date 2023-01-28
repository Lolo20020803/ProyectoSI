public class Partido {
    Equipo local;
    Equipo visitante;


    public Partido(Equipo local, Equipo visitante){
        this.local = local;
        this.visitante = visitante;
    }

    @Override
    public String toString() {
        return "Equipo Local: "+local+"\nEquipo Visitante: "+visitante+"\nClima: "+meteorologia;
    }
}
