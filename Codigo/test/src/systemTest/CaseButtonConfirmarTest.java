package src.systemTest;

import org.junit.Test;
import src.Barco;
import src.modelo.Modelo;
import src.vista.Vista;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CaseButtonConfirmarTest {
    @Test
    public void CaseButtonConfirmarTestAcorazado()
    {
        Modelo modelo = Modelo.getInstance();
        modelo.iniciarVistaMenuPrincipal();

        modelo.iniciarSeleccionDePosiciones(1); // --> Vista menú principal

        modelo.getInformacionDelJuego().getPlayer().getAcorazado(); //Pido el barco

        modelo.getInformacionDelJuego().getPlayer().espacioDisponible(5,5);

        modelo.getInformacionDelJuego().getPlayer().setBarcoSeleccionado();

        ArrayList<Barco> listaBarcos = modelo.getInformacionDelJuego().getPlayer().getFlota();

        assertEquals(1, listaBarcos.size());
    }

    @Test
    public void CaseButtonConfirmarTestSubmarino()
    {
        Modelo modelo = Modelo.getInstance();
        modelo.iniciarVistaMenuPrincipal();

        modelo.iniciarSeleccionDePosiciones(1); // --> Vista menú principal

        modelo.getInformacionDelJuego().getPlayer().getSubmarino(); //Pido el barco

        modelo.getInformacionDelJuego().getPlayer().espacioDisponible(5,5);

        modelo.getInformacionDelJuego().getPlayer().setBarcoSeleccionado();

        ArrayList<Barco> listaBarcos = modelo.getInformacionDelJuego().getPlayer().getFlota();

        assertEquals(1, listaBarcos.size());
    }

    @Test
    public void CaseButtonConfirmarTestDestructor()
    {
        Modelo modelo = Modelo.getInstance();
        modelo.iniciarVistaMenuPrincipal();

        modelo.iniciarSeleccionDePosiciones(1); // --> Vista menú principal

        modelo.getInformacionDelJuego().getPlayer().getDestructor(); //Pido el barco

        modelo.getInformacionDelJuego().getPlayer().espacioDisponible(5,5);

        modelo.getInformacionDelJuego().getPlayer().setBarcoSeleccionado();

        ArrayList<Barco> listaBarcos = modelo.getInformacionDelJuego().getPlayer().getFlota();

        assertEquals(1, listaBarcos.size());
    }

    @Test
    public void CaseButtonConfirmarTestFragata()
    {
        Modelo modelo = Modelo.getInstance();
        modelo.iniciarVistaMenuPrincipal();

        modelo.iniciarSeleccionDePosiciones(1); // --> Vista menú principal

        modelo.getInformacionDelJuego().getPlayer().getFragata(); //Pido el barco

        modelo.getInformacionDelJuego().getPlayer().espacioDisponible(5,5);

        modelo.getInformacionDelJuego().getPlayer().setBarcoSeleccionado();

        ArrayList<Barco> listaBarcos = modelo.getInformacionDelJuego().getPlayer().getFlota();

        assertEquals(1, listaBarcos.size());
    }
}
