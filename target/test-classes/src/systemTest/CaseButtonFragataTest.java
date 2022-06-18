package src.systemTest;

import org.junit.Test;
import src.modelo.Modelo;

import static org.junit.Assert.assertEquals;

public class CaseButtonFragataTest {
    @Test
    public void CaseButtonFragataTest() {
        Modelo modelo = Modelo.getInstance();
        modelo.iniciarVistaMenuPrincipal();

        modelo.iniciarSeleccionDePosiciones(1);

        modelo.getInformacionDelJuego().getPlayer().getFragata(); //Pido el barco

        assertEquals("FRAGATA", modelo.getInformacionDelJuego().getPlayer().getBarcoauxiliar().getNombre());
    }
}
