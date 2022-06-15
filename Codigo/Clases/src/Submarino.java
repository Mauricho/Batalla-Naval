package src;

public class Submarino extends Barco{
    public Submarino() {
        super(3,"SUBMARINO");
    }

    public Submarino(boolean direccion){
        super(3, "SUBMARINO");
        setDireccion(direccion);
    }
}
