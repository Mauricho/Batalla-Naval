package src.integrationTest;

import org.junit.Assert;
import org.junit.Test;
import src.Acorazado;
import src.Barco;
import src.Destructor;
import src.Submarino;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class BarcoTest {

    /**
     * Testeo las posiciones de la Fragatas.
     */
    public void setPosicionFragatas()
    {
        Barco acorazado  = new Acorazado(true);
        acorazado.setPosicion(5,5);
        int acora = acorazado.getPosicion(5,5);

        assertEquals(1,acora);
    }

    /**
     * Testeo las posiciones de los Destructores.
     */
    public void setPosicionDestructores()
    {
        Barco destructor = new Destructor(true);
        destructor.setPosicion(5,5);
        int dest = destructor.getPosicion(5,5);

        assertEquals(1,dest);
    }

    /**
     * Testeo las posiciones de los Submarinos.
     */
    public void setPosicionSubmarinos()
    {
        Barco submarino = new Submarino(true);
        submarino.setPosicion(5,5);
        int sub = submarino.getPosicion(5,5);

        assertEquals(1,sub);
    }

    /**
     * Testeo las posiciones de los Acorazados.
     */
    public void setPosicionAcorazados()
    {
        Barco acorazado = new Acorazado(true);
        acorazado.setPosicion(5,5);
        int aco = acorazado.getPosicion(5,5);

        assertEquals(1,aco);
    }
}
