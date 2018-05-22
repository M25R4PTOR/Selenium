package selenium.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Main3 {
	public static void main(String[] args) throws IOException {
		DriverSeleniumFirefox prueba = new DriverSeleniumFirefox();
		try {
			
			prueba.getDriver().get("https://www.primefaces.org/ultima/dashboard.xhtml");

			prueba.getDriver().findElement(By.id("menuform:um_components")).click();
			
			prueba.getDriver().findElement(By.id("menuform:um_sample")).click();
			
			//prueba.getDriver().findElement(By.id("j_idt50:dialog2")).click(); Los siguiente es igual pero mas efectivo
			
			Actions action = new Actions(prueba.getDriver());
			
			action.moveToElement(prueba.getDriver().findElement(By.id("j_idt50:dialog2")));
			action.click();
			action.perform();

			
			prueba.getDriver().findElement(By.id("j_idt50:j_idt101")).sendKeys("Usuario");
			prueba.getDriver().findElement(By.id("j_idt50:j_idt105")).sendKeys("Usuario");
			
			prueba.getDriver().findElement(By.name("j_idt50:j_idt108")).click();
			
			prueba.getDriver().findElement(By.id("menuform:um_messages")).click();
			
			prueba.getDriver().findElement(By.id("j_idt51:default")).sendKeys("Por defecto");

			prueba.getDriver().findElement(By.id("j_idt51:txt")).sendKeys("Textoo");

			prueba.getDriver().findElement(By.id("j_idt51:icon")).sendKeys("Icono");

			prueba.getDriver().findElement(By.id("j_idt51:inline")).sendKeys("Material error");

			prueba.getDriver().findElement(By.id("j_idt51:mtext_label")).click();
			
			prueba.getDriver().findElement(By.id("j_idt51:mtext_2")).click();
			
			prueba.getDriver().findElement(By.id("j_idt51:micon")).sendKeys("Material icon error");
			
			prueba.getDriver().findElement(By.id("j_idt51:submitButton")).click();

			System.out.println(prueba.getDriver().findElement(By.id("j_idt51:j_idt54")).getText());
			
		} catch (org.openqa.selenium.NoSuchElementException e) {
			
			System.out.println("No se ha encontrado el elemento");
			
		} finally {

			prueba.cerrarProceso();

		}
	}
}