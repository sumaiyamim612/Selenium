package azurewebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover extends BaseDriver {
	
	@Test (priority =0)
	public void startwebsite() {
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();

}

@Test (priority =1)
public void HoverTest() throws InterruptedException {
	Actions action = new Actions(driver);

    WebElement automotive = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
    WebElement motorcycle = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
    WebElement helmet = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));

    action.moveToElement(automotive).perform();
    Thread.sleep(5000);

    action.moveToElement(motorcycle).perform();
    Thread.sleep(5000);


   action.moveToElement(helmet).perform();
   Thread.sleep(5000);

   helmet.click();
   Thread.sleep(5000);
   
   driver.quit();






 }

	

}
