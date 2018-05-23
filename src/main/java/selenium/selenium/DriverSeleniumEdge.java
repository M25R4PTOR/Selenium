package selenium.selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class DriverSeleniumEdge extends DriverSelenium {

	public DriverSeleniumEdge() {

		// Indicamos la ruta del driver que levantara chrome
		final StringBuilder path = new StringBuilder();

		path.append("C:\\MicrosoftWebDriver.exe");

		System.setProperty("webdriver.edge.driver", path.toString());

		driver = new EdgeDriver();

		// maximizar la ventana
		driver.manage().window().maximize();
	}
}
