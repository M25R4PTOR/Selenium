package selenium.selenium;

import org.openqa.selenium.By;

public class Main {

	public static void main(String[] args) {
		DriverSeleniumFirefox prueba = new DriverSeleniumFirefox();
		prueba.getDriver().get("https://www.google.es");
		
		prueba.getDriver().findElement(By.id("lst-ib")).sendKeys("lista convocados selección española mundial 2018");
		
		prueba.getDriver().findElement(By.name("btnK")).click();

		System.out.println(prueba.getDriver().findElement(By.id("resultStats")).getText());
	}
}
