import java.util.Random;

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
        double jugadoresLocal =0;
        double jugadoresVisitantes =0;
        Random r = new Random();
        for(Jugador jugador : local.plantilla){
            jugadoresLocal += jugador.calcularNotaMedia();
        }
        for(Jugador jugador : visitante.plantilla){
            jugadoresVisitantes += jugador.calcularNotaMedia();
        }
        jugadoresLocal /= local.plantilla.size();
        jugadoresVisitantes /= visitante.plantilla.size();
        if(jugadoresLocal > jugadoresVisitantes){
            double div = jugadoresVisitantes / jugadoresLocal;
            double res =r.nextDouble();
            if(res > jugadoresLocal){
                visitante.puntos+=3;
            }else if(res< div && res > jugadoresVisitantes){
                local.puntos +=3;
            }
            else {
                local.puntos+=1;
                visitante.puntos+=1;
            }
        }else {
            double div = jugadoresLocal / jugadoresVisitantes;
            int res =r.nextInt(100);
            if(res > jugadoresVisitantes){
                local.puntos+=3;
            } else if (res<div && res>jugadoresLocal) {
                visitante.puntos+=3;
            }else{
                local.puntos+=1;
                visitante.puntos+=1;
            }
        }
    }
}
