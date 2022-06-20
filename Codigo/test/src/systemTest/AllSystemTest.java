package src.systemTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( {CaseButtonAcorazadoTest.class, CaseButtonCancelarTest.class, CaseButtonConfirmarTest.class, CaseButtonFragataTest.class, CaseButtonSubmarinoTest.class,
        CaseButtonSalirTest.class, CaseButtonDestructorTest.class, CaseButtonGirarTest.class, CaseButtonIniciarPartidaTest.class, CaseButtonRendirseTest.class,
        CaseButtonJugarModoLuckShotTest.class, CaseButtonJugarModoClasicoTest.class})
public class AllSystemTest {
}
