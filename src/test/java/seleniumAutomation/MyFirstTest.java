package seleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyFirstTest {
	
	@Test
	public static void OpenRefugioPage() 
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://refugio-animales.herokuapp.com";
		
		driver.get(url);
		
	}
	
}