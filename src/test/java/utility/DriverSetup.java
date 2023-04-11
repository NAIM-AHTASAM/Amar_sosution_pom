package utility;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
	 
	public WebDriver driver;
	
	@BeforeSuite

	public void setDriver() {
		
//		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
	}
	
	public static WebDriver getBrowser(String browserNane) {
		
		
		  
		return driver;
		
	}
	
	
	
	@AfterSuite
	public void quitDriver() {
		driver.quit();
	}
	
	
}
