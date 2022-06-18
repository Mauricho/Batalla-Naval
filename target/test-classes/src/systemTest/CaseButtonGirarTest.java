package src.systemTest;

import org.junit.Test;
import src.modelo.Modelo;
import static org.junit.Assert.*;


public class CaseButtonGirarTest {
    @Test
    public void CaseButtonGirarTest() {
        Modelo modelo = Modelo.getInstance();
        modelo.iniciarVistaMenuPrincipal();

        modelo.iniciarSeleccionDePosiciones(1);

        modelo.getInformacionDelJuego().getPlayer().getAcorazado(); //Pido el barco

        modelo.getInformacionDelJuego().getPlayer().girar();

        boolean pos1 = modelo.getInformacionDelJuego().getPlayer().getDireccion();

        assertEquals(false,pos1);
    }
}
