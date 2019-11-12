package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ppassing {
	
	WebDriver driver;
	
    @Parameters({"Browser"})
	@Test
	public void openBrowser(String s) {
		if(s.contentEquals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
		}
		else if(s.contentEquals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver =new FirefoxDriver();
		}
		else {
			System.out.println("Browser not found");
		}
		driver.get("https://www.google.com/");
	}
}
