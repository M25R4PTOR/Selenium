package selenium.selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main2 {

	public static void main(String[] args) throws IOException {
		DriverSeleniumFirefox prueba = new DriverSeleniumFirefox();
		try {
			
			prueba.getDriver().get("https://www.google.es");

			prueba.getDriver().findElement(By.id("lst-ib")).sendKeys("primefaces showcase");

			prueba.getDriver().findElement(By.name("btnK")).click();

			prueba.getDriver().findElement(By.partialLinkText("PrimeFaces ShowCase")).click();

			prueba.getDriver().findElement(By.id("SubMenu-Data")).click();

			prueba.getDriver().findElement(By.partialLinkText("DataTable")).click();

//			List<WebElement> lista = prueba.getDriver().findElements(By.id("j_idt115_head"));
//
//			for (WebElement aux : lista) {
//				System.out.println(aux.getText());
//			}
			
			System.out.println(prueba.getDriver().findElement(By.id("j_idt115_head")).getText());
			
		} catch (org.openqa.selenium.NoSuchElementException e) {
			
			System.out.println("No se ha encontrado el elemento");
			
		} finally {

			prueba.cerrarProceso();

		}
	}
}