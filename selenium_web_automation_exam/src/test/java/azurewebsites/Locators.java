package azurewebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators extends BaseDriver {
	
	@Test (priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(azure); 
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test (priority = 1)
	public void testLocators() throws InterruptedException{
	
    	WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
    	WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='phone']"));
    	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
    	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
    	WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
    	WebElement submit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
    	
    	name.sendKeys("Test");
		mobileNumber.sendKeys("12345678901");
		email.sendKeys("test@gmail.com");
		password.sendKeys("******");
		address.sendKeys("BD-Dhaka");
		submit.click();
        Thread.sleep(5000);
        driver.quit();
		
}

		
	
}
