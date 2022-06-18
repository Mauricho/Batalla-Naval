package src.integrationTest;

import org.junit.Assert;
import org.junit.Test;
import src.jugador;

import static org.junit.Assert.*;

public class jugadorTest {

    /*@Test
    public void generarFlota() {
    }*/

    @Test
    public void disparo() {
    }

    @Test
    public void disparoE() {
    }

    @Test
    public void devolverBarco() {
        jugador test = new jugador();
        test.getAcorazado();
        test.devolverBarco();
        assertSame(null,test.getBarcoauxiliar());
    }

    @Test
    public void espacioDisponible() {
    }

    @Test
    public void setBarcoSeleccionado() {
    }
    @Test
    public void generarFlotaAleatorio() {
        jugador test = new jugador();
        test.generarFlotaAleatorio();
        int result = test.getFlota().size();
        assertEquals(10,result);
    }
}