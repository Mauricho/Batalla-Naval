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

    /**
     * Testeo la cantidad de Fragatas.
     */
    @Test
    public void cantFragatas(){
        jugador test = new jugador();
        test.generarFlotaAleatorio();
        int cantFragatas = test.getCantFragatas();
        assertEquals(4,cantFragatas);
    }

    /**
     * Testeo la cantidad de Destructores.
     */
    @Test
    public void cantDestructores(){
        jugador test = new jugador();
        test.generarFlotaAleatorio();
        int cantDestructores = test.getCantDestructores();
        assertEquals(3,cantDestructores);
    }

    /**
     * Testeo la cantidad de Submarinos.
     */
    @Test
    public void cantSubmarinos(){
        jugador test = new jugador();
        test.generarFlotaAleatorio();
        int cantSubmarinos = test.getCantFragatas();
        assertEquals(2,cantSubmarinos);
    }

    /**
     * Testeo la cantidad de Acorazados.
     */
    @Test
    public void cantAcorazados(){
        jugador test = new jugador();
        test.generarFlotaAleatorio();
        int cantAcorazados = test.getCantAcorazados();
        assertEquals(1,cantAcorazados);
    }
}