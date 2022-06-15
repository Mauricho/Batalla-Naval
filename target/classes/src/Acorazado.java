package src;

public class Acorazado extends Barco{

    public Acorazado() {
        super(4, "ACORAZADO");
    }
    public Acorazado(boolean direccion){
        super(4,"ACORAZADO");
        setDireccion(direccion);
    }
}
