package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StaticParameterizationTestNG extends BaseClassStaticParameterizationTestNG{
	@Test
	public void runStaticParameterization() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//div[@class='slds-size_medium']//lightning-button")).click();
		driver.findElement(By.xpath("//lightning-input[@class='searchBar slds-form-element']")).sendKeys("Legal Entities"+Keys.ENTER);
		driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left_none slds-p-right_x-small']")).click();
		driver.findElement(By.xpath("//span[@class='slds-truncate']//span")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Parameterization");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("StaticParameterization");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Static Parameterization Tested");

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement status = driver.findElement(By.xpath("//button[@aria-label='Status']"));
		jse.executeScript("arguments[0].scrollIntoView();",status);

		driver.findElement(By.xpath("//button[@aria-label='Status']")).click();
		driver.findElement(By.xpath("//span[@class='slds-media__body']//span[@title='Active']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		WebElement alert_msg = driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']"));
		String alert = alert_msg.getText();
		System.out.println("------Demonstarting Static Parameterization in TestNG------");
		System.out.println("Alert Message : "+alert);
	}
}
