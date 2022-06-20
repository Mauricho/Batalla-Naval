package src.systemTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( {CaseButtonAcorazadoTest.class, CaseButtonCancelarTest.class, CaseButtonConfirmarTest.class, CaseButtonFragataTest.class, CaseButtonSubmarinoTest.class,
        CaseButtonDestructorTest.class, CaseButtonGirarTest.class, CaseButtonIniciarPartidaTest.class,
        CaseButtonJugarModoLuckShotTest.class, CaseButtonJugarModoClasicoTest.class})
public class AllSystemTest {

}
