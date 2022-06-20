package src.integrationTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({jugadorTest.class,ModeloTest.class, DatosPartidaTest.class})

public class AllIntegrationTest {
}
