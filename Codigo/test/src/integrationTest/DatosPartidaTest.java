package src.integrationTest;

import org.junit.Test;
import src.DatosPartida;

import static org.junit.Assert.*;

public class DatosPartidaTest {

    @Test
    public void disparo() {
        DatosPartida datosPartida = new DatosPartida(1);
        datosPartida.getPlayer().generarFlotaAleatorio();
        datosPartida.setEnemigo();

        boolean flag = false;
        try{
            datosPartida.getPlayer().disparo(5,5);
            flag = true;
        }
        catch (IndexOutOfBoundsException e){
            flag = false;
        }

        assertTrue(flag);
    }

    @Test
    public void disparoE() {
    }
}