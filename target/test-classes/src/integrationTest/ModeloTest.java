package src.integrationTest;
import static org.junit.Assert.*;

import org.junit.Test;

import src.modelo.Modelo;
//import src.vista.Vista;

public class ModeloTest {

    @Test
    public void ModeloTest(){
        Modelo modelo = Modelo.getInstance();
        Modelo modelo2 = Modelo.getInstance();

        assertEquals(modelo, modelo2);
    }
}
