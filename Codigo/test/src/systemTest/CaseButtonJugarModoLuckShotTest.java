package src.systemTest;

import org.junit.Test;
import src.modelo.Modelo;
import src.vista.Vista;
import static org.junit.Assert.*;

public class CaseButtonJugarModoLuckShotTest {

    @Test
    public void CaseButtonJugarModoLuckShotTest(){
        Modelo modelo = Modelo.getInstance();
        modelo.iniciarVistaMenuPrincipal();

        Vista vistaMenuPrincipal = modelo.getVistaActual();

        modelo.iniciarSeleccionDePosiciones(2);
        Vista SeleccionDePosiciones = modelo.getVistaActual();

        // testea si la vista actual no es el menu principal
        assertNotEquals(vistaMenuPrincipal, SeleccionDePosiciones);
    }
}
