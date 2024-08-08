package marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Edit extends BaseClass {


	@BeforeTest
	public void exceLpassing()
	{
		excelPath="./data/Marathon3.xlsx";
		sheetName="Edit";
	}


	@Test(dataProvider="sendData")
	public void runEditOppurtunity(String oppurtunityName, String closeDate,String stage,String deliveryOrInstallationStatus) throws InterruptedException
	{
		System.out.println("===============================================================");
		System.out.println("      Marathon 3 TestNG Framework Static Parameterization      ");
		System.out.println("===============================================================");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-size_medium']//lightning-button")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.standard-Opportunity']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("Salesforce automation by Vinod Radhakrishna"+Keys.ENTER);		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Salesforce automation by Vinod Radhakrishna']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//lightning-button-menu[@class='menu-button-item slds-dropdown-trigger slds-dropdown-trigger_click']//button[@type='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//runtime_platform_actions-action-renderer[@title='Edit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Name']")).clear();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(oppurtunityName);
		System.out.println("Oppurtunity Name(Before Save) : " +oppurtunityName);
		driver.findElement(By.xpath("//div[@part='input-container']//input[@name='CloseDate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@aria-label='"+closeDate+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right'])[4]")).click();
		driver.findElement(By.xpath("//span[@class='slds-truncate' and @title='"+stage+"']")).click();
		Thread.sleep(1000);
		WebElement deliveryInstallationStatus = driver.findElement(By.xpath("//button[@aria-label='Delivery/Installation Status']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", deliveryInstallationStatus);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Delivery/Installation Status']/following::button[1]")).click();
		driver.findElement(By.xpath("//span[@title='"+deliveryOrInstallationStatus+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("SalesForce");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String verificationMessage = driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']")).getText();
		Thread.sleep(4000);
		System.out.println("Oppurtunity Name(After Save) : " +verificationMessage);
		if(verificationMessage.contains(oppurtunityName))
		{
			System.out.println("The Oppurtunity name modification is verified");
		}
		else
		{
			System.err.println("The Oppurtunity name modification is Not verified");
		}
	}
}
