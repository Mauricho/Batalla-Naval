package src;

public class Submarino extends Barco{
    public Submarino() {
        super(1,"SUBMARINO");
    }

    public Submarino(boolean direccion){
        super(1, "SUBMARINO");
        setDireccion(direccion);
    }
}
