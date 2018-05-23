package selenium.selenium;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MainC {


	public static void main(String[] args) throws IOException {
		DriverSeleniumChrome prueba = new DriverSeleniumChrome();
		
		prueba.getDriver().get("https://www.google.es");
		
		prueba.getDriver().findElement(By.id("lst-ib")).sendKeys("lista convocados selección española mundial 2018 RTVE");

		Actions action = new Actions(prueba.getDriver());
		
		action.moveToElement(prueba.getDriver().findElement(By.name("btnK")));
		action.click();
		action.perform();

		System.out.println(prueba.getDriver().findElement(By.id("resultStats")).getText());
	
		prueba.cerrarProceso();
	}
}
