package selenium.selenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class DriverSelenium {

	static protected WebDriver driver;
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void cerrarProceso() throws IOException{
		if(getDriver() instanceof DriverSeleniumFirefox) {
			
			Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
			
		}else if(getDriver() instanceof DriverSeleniumChrome) {
			
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
			
		}else {
			Runtime.getRuntime().exec("taskkill /F /IM MicrosoftWebDriver.exe");
		}
		
		System.out.println("Prueba finalizada");
		
	}
	
	public void esperarElementoEsteVisibleById(String id) {
		final WebDriverWait wait = new WebDriverWait(this.driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(id))).click();
	}
	
	public static void takesScreenshot(String ruta, String nombre) {
		try {
			System.out.println("Realizando captura...");
			TakesScreenshot obj = (TakesScreenshot)driver;
			File origen = obj.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
			File destino = new File(ruta + nombre + ".png");
			System.out.println("Realizando captura..." + destino);
			FileUtils.copyFile(origen, destino);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
