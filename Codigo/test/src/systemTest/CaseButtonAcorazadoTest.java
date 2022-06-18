package src.systemTest;

import org.junit.Test;
import src.Acorazado;
import src.Barco;
import src.modelo.Modelo;
import static org.junit.Assert.*;

public class CaseButtonAcorazadoTest {

    @Test
    public void CaseButtonAcorazadoTest() {
        Modelo modelo = Modelo.getInstance();
        modelo.iniciarVistaMenuPrincipal();

        modelo.iniciarSeleccionDePosiciones(1);

        modelo.getInformacionDelJuego().getPlayer().getAcorazado(); //Pido el barco

        assertEquals("ACORAZADO", modelo.getInformacionDelJuego().getPlayer().getBarcoauxiliar().getNombre());
    }
}
