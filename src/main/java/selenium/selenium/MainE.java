package selenium.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class MainE {

	public static void main(String[] args) throws IOException, InterruptedException {
		DriverSeleniumEdge prueba = new DriverSeleniumEdge();
		Actions action = new Actions(prueba.getDriver());
		
		prueba.getDriver().navigate().to("https://www.google.es");
		
		prueba.getDriver().findElement(By.id("lst-ib")).sendKeys("lista convocados selección española mundial 2018 RTVE");
		
		DriverSelenium.takesScreenshot("C:\\Users\\formacion\\Desktop\\capturas\\", "prueba");
		
		prueba.getDriver().findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		
//		action.moveToElement(prueba.getDriver().findElement(By.name("btnK")));
//		action.click();
//		action.perform();
	
		prueba.cerrarProceso();
	}
}

