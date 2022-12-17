package azurewebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	
	static String azure = "https://itera-qa.azurewebsites.net/home/automation";
	
	WebDriver driver;

	@BeforeSuite
	public void satrt() {
		String browser = System.getProperty("browser", "chrome");
		
		if(browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		}

	
	@AfterSuite
	public void end() {
		//driver.quit();
	}

}


