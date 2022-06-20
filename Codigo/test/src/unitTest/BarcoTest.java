package src.unitTest;

import org.junit.Test;
import src.Acorazado;
import src.Barco;
import src.Destructor;
import src.Submarino;

import static org.junit.Assert.assertEquals;

public class BarcoTest {

    /**
     * Testeo las posiciones de la Fragatas.
     */
    @Test
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
    @Test
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
    @Test
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
    @Test
    public void setPosicionAcorazados()
    {
        Barco acorazado = new Acorazado(true);
        acorazado.setPosicion(5,5);
        int aco = acorazado.getPosicion(5,5);

        assertEquals(1,aco);
    }

    @Test
    public void testBordeTablero(){
        int flag = -1;
        try{
            Barco acorazado = new Acorazado();
            acorazado.setPosicion(8,8);
            flag=1;
        }
        catch(IndexOutOfBoundsException e){
            flag = 0;
        }
        assertEquals(0,flag);
    }
}