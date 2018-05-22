package selenium.selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

public class Main {


	
	public static void main(String[] args) throws IOException {
		DriverSeleniumFirefox prueba = new DriverSeleniumFirefox();
		
		prueba.getDriver().get("https://www.google.es");
		
		prueba.getDriver().findElement(By.id("lst-ib")).sendKeys("lista convocados selección española mundial 2018 RTVE");
		
		prueba.getDriver().findElement(By.name("btnK")).click();

		System.out.println(prueba.getDriver().findElement(By.id("resultStats")).getText());
		
		prueba.getDriver().findElement(By.partialLinkText("Mundial 2018 | Selección española - RTVE.es")).click();
		
		List<WebElement> lista = prueba.getDriver().findElements(By.className("section"));
		
		for (WebElement aux: lista) {
			System.out.println(aux.getText());
		}
		
		//lista.get(0)
		
		prueba.cerrarProceso();
	}
}
