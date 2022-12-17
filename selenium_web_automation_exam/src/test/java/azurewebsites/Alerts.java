package azurewebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

public class Alerts extends BaseDriver {
	@Test (priority = 0)
	public void startWebsite() {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	}
	
	@Test (priority =1)
	public void alertCheck() throws InterruptedException {
		WebElement jsAlert= driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm= driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPrompt= driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		
		jsAlert.click();
//		Thread.sleep(5000);
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String resultText = result.getText();
		if(resultText.contains("You successfully click an alert")) {
			System.out.println("passed: "+resultText);
		}
		
//		SoftAssert softAssert = new SoftAssert();
		
//		Assert.assertEquals(actual, expected);
//		softAssert.assertEquals(resultText, "You successfully click an alert");
		
		jsConfirm.click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
//		softAssert.assertAll();
		
		jsPrompt.click();
		driver.switchTo().alert().sendKeys("Hello Alert");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
	
	}
		
	

}

	


