package src.systemTest;

import org.junit.Test;
import src.modelo.Modelo;
import src.vista.Vista;

import static org.junit.Assert.assertNotEquals;

public class CaseButtonConfirmarTest {
    @Test
    public void CaseButtonConfirmarTest()
    {
        Modelo modelo = Modelo.getInstance();
        modelo.iniciarVistaMenuPrincipal();

        modelo.iniciarSeleccionDePosiciones(1); // --> Vista menú principal
        Vista SeleccionDePosiciones = modelo.getVistaActual();

        //Genere la flota
        modelo.getInformacionDelJuego().getPlayer().generarFlotaAleatorio();

        modelo.iniciarJuegoNormal();

        Vista iniciar =  modelo.getVistaActual(); //Esta en "MODELO"

        assertNotEquals(SeleccionDePosiciones, iniciar);
    }
}
