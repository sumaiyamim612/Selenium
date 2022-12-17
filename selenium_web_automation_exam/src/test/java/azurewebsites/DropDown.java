package azurewebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

public class DropDown extends BaseDriver {
	
	@Test (priority = 0)
	public void startWebsite() {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	}
	@Test (priority = 1)
	public void DropDownTest() throws InterruptedException {
		WebElement custom = driver.findElement(By.xpath("//option[contains(text(),'Select option')]"));
		
		Select select = new Select(custom);
		
		select.selectByValue("Noraway");
		Thread.sleep(5000);

}
}