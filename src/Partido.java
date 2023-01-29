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
        for(Jugador jugador : local.plantilla){
            jugadoresLocal += jugador.calcularNotaMedia();
        }
        for(Jugador jugador : visitante.plantilla){
            jugadoresVisitantes += jugador.calcularNotaMedia();
        }
        jugadoresLocal /= local.plantilla.size();
        jugadoresVisitantes /= visitante.plantilla.size();
        double puntuacionLocal = jugadoresLocal * 0.70 + local.notaMedia*0.3;
        double puntuacionVisitante = jugadoresVisitantes * 0.70 + visitante.notaMedia*0.3;
        double div = puntuacionVisitante / puntuacionLocal;
        if(puntuacionLocal >= puntuacionVisitante){
            if(div>1){
                visitante.puntos +=3;
            }else if(div == 1){
                local.puntos +=1;
                visitante.puntos +=1;
            } else if (div>0.66 && div < 1 ) {
               local.puntos +=3;
            } else if (div>=0.33 && div <=0.66) {
                local.puntos +=1;
                visitante.puntos +=1;
            } else{
                visitante.puntos+=3;
            }
        } else if (puntuacionLocal > puntuacionVisitante) {
            if(div > 1){
                local.puntos += 3;
            } else if (div==1) {
                local.puntos +=1;
                visitante.puntos +=1;
            }else if(div>0.66 && div < 1 ){
                visitante.puntos +=3;
            } else if (div>=0.33 && div <=0.66) {
                local.puntos +=1;
                visitante.puntos +=1;
            }else {
                local.puntos+=3;
            }
        }

    }
}
