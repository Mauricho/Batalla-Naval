package src.systemTest;

import org.junit.Test;
import src.jugador;
import src.vista.Vista;
import src.modelo.Modelo;

import static org.junit.Assert.assertNotEquals;

public class CaseButtonIniciarPartidaTest {
    @Test
    public void CaseButtonIniciarPartidaTest()
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
