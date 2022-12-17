package azurewebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBox extends BaseDriver{
			
		@Test (priority = 0)
		public void startWebsite() {
			driver.get("https://itera-qa.azurewebsites.net/home/automation");
			driver.manage().window().maximize();
		}
		@Test (priority = 1)
		public void testLocators() throws InterruptedException{
			
			WebElement genderfemale = driver.findElement(By.xpath("//input[@id='female']"));
			WebElement weektuesday = driver.findElement(By.xpath("//input[@id='tuesday']"));
			WebElement weekfriday = driver.findElement(By.xpath("//input[@id='friday']"));
			
			genderfemale.click();
			Thread.sleep(5000);
			
			weektuesday.click();
			Thread.sleep(5000);
			
			weekfriday.click();
			Thread.sleep(5000);
			
			driver.quit();
			
		}

}
