package pages;

import core.BasePage;

import static core.DriverFactory.getDriver;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {


	public void clicarNoMenuDados() throws Exception {	
		try {
			
			clicarBotaoPorXpath("(//a[@href='#/dados'])[1]");
		}catch (Exception e) {
			System.out.println("O link Dados não foi encontrado");
		}
	}	
	
	/****** DOWNLOAD ****/
	
	public void fazerDownload(String nome_documento) throws Exception {

		aguardarPaginaCarregar(8);
		
		String xpath_btn_download = "//h5[contains(text(), 'XXXX')]//following-sibling::button[@ng-click='download(i.id, $event)']";
		xpath_btn_download = xpath_btn_download.replace("XXXX", nome_documento);
		WebElement btn_Download = getDriver().findElement(By.xpath(xpath_btn_download));

		if (btn_Download.isDisplayed()) {
			btn_Download.click();
			System.out.println("Botão de download do arquivo " + nome_documento + " foi clicado.");
			Thread.sleep(2);
			System.out.println("Arquivo foi baixado com sucesso!");
		} else {
			System.out.println("O botão não foi clicado, pois não está visível na tela");
		}
		
		aguardarPaginaCarregar(15);
	}	

}
