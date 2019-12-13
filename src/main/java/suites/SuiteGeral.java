package suites;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import core.DriverFactory;
import pages.LoginPage;
import tests.HomePageTest;

@RunWith(Suite.class)
@SuiteClasses({ HomePageTest.class })

public class SuiteGeral {

	private static LoginPage loginPage = new LoginPage();

	@BeforeClass
	public static void inicializa() throws Exception {

		loginPage.acessarTelaInicial();
		loginPage.validaTituloDaPagina();
		loginPage.setEmail("pedro.caliman@grupohinode.com");
		loginPage.setSenha("Hinode@2019");
		loginPage.clicaNoBotaoEntrar();
		Thread.sleep(6);
	}

	@AfterClass
	public static void finaliza() throws Exception {
		DriverFactory.killDriver();
	}

}
