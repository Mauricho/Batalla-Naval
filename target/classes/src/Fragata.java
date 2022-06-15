package src;

public class Fragata extends Barco{

    public Fragata() {
        super(1,"FRAGATA");
    }
    public Fragata(boolean direccion) {
        super(1,"FRAGATA");
        setDireccion(direccion);
    }
}
