package src.systemTest;

import org.junit.Test;
import src.modelo.Modelo;
import src.vista.Vista;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CaseButtonSalirTest {
    @Test
    public void CaseButtonSalirTest()
    {Modelo modelo = Modelo.getInstance();
        modelo.iniciarVistaMenuPrincipal();

        modelo.salirJuego();


        Vista vistaJuegoCerrado = modelo.getVistaActual();

        assertNull(vistaJuegoCerrado);
    }
}
