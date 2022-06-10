package src;

import org.junit.Test;

import static org.junit.Assert.*;

public class BarcoTest {

    @Test
    public void girar() {

    }

    @Test
    public void setPosicion() {
        Barco barco = new Acorazado();
        try {
            barco.setPosicion(0,0);
        }
        catch(IndexOutOfBoundsException e){
            e.getStackTrace();
        }
    }
}