package tests;

import static core.DriverFactory.killDriver;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import core.BasePage;
import core.BaseTest;
import core.Propriedades;
import pages.HomePage;
import pages.LoginPage;
import suites.SuiteGeral;
public class HomePageTest extends BaseTest{

	HomePage home = new HomePage();
	LoginPage loginPage = new LoginPage();

	@Test
	public void testBaixarArquivoDeDados() throws Exception {		
		System.out.println("Entrou na HomePage");
		home.clicarNoMenuDados();
		home.fazerDownload("BI_HND");

	}

}
