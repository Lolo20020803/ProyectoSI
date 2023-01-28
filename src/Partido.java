public class Partido {
    Equipo local;
    Equipo visitante;
    boolean modificado = false;
    public Partido(Equipo local, Equipo visitante){
        this.local = local;
        this.visitante = visitante;
    }

    @Override
    public String toString() {
        return "Equipo Local: "+local+"\nEquipo Visitante: "+visitante+"\nClima: ";
    }
    public boolean eresLocal(Equipo param){
        return this.local.equals(param);
    }
    public boolean eresVisitante(Equipo param){
        return this.visitante.equals(param);
    }
    public boolean partidoExacto(Equipo local, Equipo visitante){
        return eresLocal(local) && eresVisitante(visitante);
    }
    public void modificar(){
        modificado = true;
    }


    public void simular(){

    }
}
