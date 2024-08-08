package marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Delete extends BaseClass {

	@BeforeTest
	public void exceLpassing()
	{
		excelPath="./data/Marathon3.xlsx";
		sheetName="Delete";
	}

	@Test(dataProvider="sendData")
	public void deleteOppurtunity(String oppurtunityName) throws InterruptedException
	{
		System.out.println("===============================================================");
		System.out.println("      Marathon 3 TestNG Framework Static Parameterization      ");
		System.out.println("===============================================================");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-size_medium']//lightning-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.standard-Opportunity']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys(oppurtunityName+Keys.ENTER);
		System.out.println("Oppurtunity Name(Before Deletion) : " +oppurtunityName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='"+oppurtunityName+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//lightning-button-menu[@class='menu-button-item slds-dropdown-trigger slds-dropdown-trigger_click']//button[@type='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//runtime_platform_actions-action-renderer[@title='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Delete' and @class=' label bBody']")).click();
		String deleteOppurtunityMessage = driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']")).getText();
		Thread.sleep(7000);
		System.out.println("Oppurtunity Name(After Deletion) : " +deleteOppurtunityMessage);
		if(deleteOppurtunityMessage.contains(oppurtunityName))
		{
			System.out.println("The Oppurtunity Name is verified ");
		}
		else
		{
			System.out.println("The Oppurtunity Name is Not Verified");
		}
	}
}
