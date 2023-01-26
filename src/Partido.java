public class Partido {
    Convocatoria local;
    Convocatoria visitante;
    Meteorologia meteorologia;

    public Partido(Convocatoria local, Convocatoria visitante, Meteorologia meteorologia){
        this.local = local;
        this.visitante = visitante;
        this.meteorologia = meteorologia;
    }

    @Override
    public String toString() {
        return "Equipo Local: "+local+"\nEquipo Visitante: "+visitante+"\nClima: "+meteorologia;
    }
}
