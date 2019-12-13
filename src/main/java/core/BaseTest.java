package core;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;
import static utils.Utils.*;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;

import pages.LoginPage;

public class BaseTest {
	
	private static LoginPage loginPage = new LoginPage();

	@Before
	public void inicializa() throws Exception {

		loginPage.acessarTelaInicial();
		loginPage.validaTituloDaPagina();
		loginPage.setEmail("pedro.caliman@grupohinode.com");
		loginPage.setSenha("Hinode@2019");
		loginPage.clicaNoBotaoEntrar();
		aguardarPaginaCarregar(7);
	}
	
	
	@After
	public void finaliza() throws IOException {

		if (Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}
}
