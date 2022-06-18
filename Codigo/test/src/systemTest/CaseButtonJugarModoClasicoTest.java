package src.systemTest;

import org.junit.Test;
import src.vista.Vista;
import src.modelo.Modelo;
import static org.junit.Assert.*;

public class CaseButtonJugarModoClasicoTest {

    @Test
    public void CaseButtonJugarModoClasicoTest() {
        Modelo modelo = Modelo.getInstance();
        modelo.iniciarVistaMenuPrincipal();

        Vista vistaMenuPrincipal = modelo.getVistaActual();
        /*
        modelo.iniciarJuegoNormal();
         */
        modelo.iniciarSeleccionDePosiciones(1);
        Vista SeleccionDePosiciones = modelo.getVistaActual();

        // testea si la vista actual no es el menu principal
        assertNotEquals(vistaMenuPrincipal, SeleccionDePosiciones);
    }
}