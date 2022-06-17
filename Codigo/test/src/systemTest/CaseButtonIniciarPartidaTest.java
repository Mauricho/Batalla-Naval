package src.systemTest;

import org.junit.Test;
import src.jugador;
import src.vista.Vista;
import src.modelo.Modelo;

import static org.junit.Assert.assertNotEquals;

public class CaseButtonIniciarPartidaTest {
    // Iniciar modelo
    // Iniciar la vista del menú principal como el actual

    // Iniciar juego normal
    // Actualizar la vista actual

    // Jugador llama al método generarFlotaAleatoria()
    // Iniciar la partida

    // testear si la vista actual es la del tablero
    @Test
    public void CaseButtonIniciarPartidaTest()
    {
        Modelo modelo = Modelo.getInstance();
        modelo.iniciarVistaMenuPrincipal();

        Vista vistaMenuPrincipal = modelo.getVistaActual();
        modelo.iniciarSeleccionDePosiciones(1); // --> Vista menú principal
        Vista SeleccionDePosiciones = modelo.getVistaActual();

        //Genere la flota
        modelo.getInformacionDelJuego().getPlayer().generarFlotaAleatorio();

        modelo.iniciarJuegoNormal();

        Vista iniciar =  modelo.getVistaActual(); //Esta en "MODELO"

        assertNotEquals(SeleccionDePosiciones, iniciar);
    }

}
