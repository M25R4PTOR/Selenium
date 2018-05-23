package selenium.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSeleniumChrome extends DriverSelenium{
	
	public DriverSeleniumChrome() {
		
		//Indicamos la ruta del driver que levantara chrome
		final StringBuilder path = new StringBuilder();
		
		path.append("C:\\chromedriver64.exe");
		
		System.setProperty("webdriver.chrome.driver", path.toString());
	
		
		driver = new ChromeDriver();
		
		//maximizar la ventana
		driver.manage().window().maximize();
	}
}
