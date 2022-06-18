package src.systemTest;

import org.junit.Test;
import src.modelo.Modelo;

import static org.junit.Assert.assertEquals;

public class CaseButtonSubmarinoTest {
    @Test
    public void CaseButtonSubmarinoTest() {
        Modelo modelo = Modelo.getInstance();
        modelo.iniciarVistaMenuPrincipal();

        modelo.iniciarSeleccionDePosiciones(1);

        modelo.getInformacionDelJuego().getPlayer().getSubmarino(); //Pido el barco

        assertEquals("SUBMARINO", modelo.getInformacionDelJuego().getPlayer().getBarcoauxiliar().getNombre());
    }
}
