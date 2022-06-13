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
        modelo.iniciarJuegoNormal();
        Vista SeleccionDePosiciones = modelo.getVistaActual();

        assertNotEquals(vistaMenuPrincipal, SeleccionDePosiciones);
    }
}