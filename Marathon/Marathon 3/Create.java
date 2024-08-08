package marathon3;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Create extends BaseClass {

	@BeforeTest
	public void exceLpassing()
	{
		excelPath="./data/Marathon3.xlsx";
		sheetName="Create";
	}
	
	
	@Test(dataProvider="sendData")
	public void runCreateOppurtunity(String oppurtunityName, String amount ) throws InterruptedException
	{
		System.out.println("===============================================================");
		System.out.println("      Marathon 3 TestNG Framework Static Parameterization      ");
		System.out.println("===============================================================");
		driver.findElement(By.xpath("//div[@class='slds-size_medium']//lightning-button")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.standard-Opportunity']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//ul[@class='oneActionsRibbon forceActionsContainer']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//li[@role='presentation'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(oppurtunityName);
		System.out.println("Oppurtunity Name(Before Creation) : " +oppurtunityName);	
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//td[@aria-label='2024-08-02']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String createOppurtunityMessage = driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']")).getText();
		System.out.println("Oppurtunity Name(After Creation) : " +createOppurtunityMessage);
		if(createOppurtunityMessage.contains(oppurtunityName))
		{
			System.out.println("The Oppurtunity Name is verified ");
		}
		else
		{
			System.out.println("The Oppurtunity Name is Not Verified");
		}
	}
}
