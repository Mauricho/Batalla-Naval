package src;

import java.util.ArrayList;

public class Terminal implements Sujeto{
    private int dx;
    private int dy;
    private int condicionActual;
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
            observadores.get(i).actualizar(dx,dy,condicionActual);
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

    public void actualizar(int dx, int dy, int condicion){
        setDx(dx);
        setDy(dy);
        setCondicionActual(condicion);
        avisarObservadores();
    }
}
