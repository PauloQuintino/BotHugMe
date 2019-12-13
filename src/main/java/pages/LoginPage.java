package pages;

import core.BasePage;
import static core.DriverFactory.getDriver;
import static org.junit.Assert.*;

import org.junit.Assert.*;;

public class LoginPage extends BasePage {
		
	public void acessarTelaInicial() {
		getDriver().get("https://app.hugme.com.br/");
	}
	
	public void setEmail(String email) {
		escrever("user", email);
		System.out.println("Inserido e-mail: " + email);
	}
	
	public void setSenha(String senha) {
		escrever("password", senha);
		System.out.println("Inserido senha: " + senha);
	}
	
	public void validaTituloDaPagina() {
		assertEquals("HugMe", getDriver().getTitle());;
		System.out.println("Título apresentado: " + getDriver().getTitle());
	}
	
	public void clicaNoBotaoEntrar() {
		clicarBotao("submit-button");
		System.out.println("Clicado no botão Entrar");
	}

}
