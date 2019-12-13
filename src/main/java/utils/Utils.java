package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static core.DriverFactory.*;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Utils {

	private static WebDriverWait wait = new WebDriverWait(getDriver(), 6);

	public static void aguardarOElementoCarregar(WebElement elemento) {
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}
	
	public static void aguardarPaginaCarregar(int segundos) {
		try {
			TimeUnit.SECONDS.sleep(segundos);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
