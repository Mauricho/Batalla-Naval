package src;

import java.util.ArrayList;

public class Terminal implements Sujeto{
    private int dx;
    private int dy;
    private int condicionActual;
    private String jugador;
    private ArrayList<Observador> observadores;
    public Terminal(){
        observadores = new ArrayList<>();
    }

    @Override
    public void suscribirObservador(Observador ob) {
        observadores.add(ob);
    }

    @Override
    public void desuscribirObservador(Observador ob) {
        observadores.remove(ob);
    }

    @Override
    public void avisarObservadores() {
        for(int i=0;i< observadores.size();i++){
            observadores.get(i).actualizar(dx,dy,condicionActual,jugador);
        }
    }

    public void setDx(int dx){
        this.dx=dx;
    }

    public void setDy(int dy){
        this.dy=dy;
    }

    public void setCondicionActual(int condicion){
        condicionActual=condicion;
    }

    public void setJugador(String jugador){this.jugador=jugador;}

    public void actualizar(int dx, int dy, int condicion, String jugador){
        setDx(dx);
        setDy(dy);
        setCondicionActual(condicion);
        setJugador(jugador);
        avisarObservadores();
    }
}
