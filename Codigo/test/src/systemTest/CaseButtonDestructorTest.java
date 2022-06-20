package src.systemTest;

import org.junit.Test;
import src.modelo.Modelo;

import static org.junit.Assert.assertEquals;

public class CaseButtonDestructorTest {
    @Test
    public void CaseButtonDestructorTest() {
        Modelo modelo = Modelo.getInstance();
        modelo.iniciarVistaMenuPrincipal();

        modelo.iniciarSeleccionDePosiciones(1);

        modelo.getInformacionDelJuego().getPlayer().getDestructor(); //Pido el barco

        assertEquals("DESTRUCTOR", modelo.getInformacionDelJuego().getPlayer().getBarcoauxiliar().getNombre());
    }
}
