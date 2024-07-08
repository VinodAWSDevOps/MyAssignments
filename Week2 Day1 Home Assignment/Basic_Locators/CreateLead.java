package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Initializing the ChromeDriver
				ChromeDriver driver = new ChromeDriver();
				//Launching the leaftaps portal
				driver.get("http://leaftaps.com/opentaps/");
				//Maximizing the driver window
				driver.manage().window().maximize();
				//Sending username value to username element
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				//Waiting to see the data loads to element
				Thread.sleep(1000);
				//Sending password value to password element
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Clicking on Login button
				driver.findElement(By.className("decorativeSubmit")).click();
				//Clicking on CRM/SFA linktext
				driver.findElement(By.partialLinkText("CRM/SFA")).click();
				//Clicking the Accounts Tab
				driver.findElement(By.partialLinkText("Leads")).click();
				Thread.sleep(1000);
				driver.findElement(By.linkText("Create Lead")).click();
				//Entering the Company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Company");
				//Waiting to see the data loads to element
				Thread.sleep(1000);
				//Entering the First name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("John");
				//Waiting to see the data loads to element
				Thread.sleep(1000);	
				//Entering the Last name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Doe");
				//Waiting to see the data loads to element
				Thread.sleep(1000);
				//Entering the Title
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SDET II");
				//Waiting to see the data loads to element
				Thread.sleep(1000);
				//Clicking on Create Lead button
				driver.findElement(By.name("submitButton")).click();
				//Retrieving the text of Company name
				String lead = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				//Displaying the text
				System.out.println("The Company Name is : "+lead);
				//ChromeDriver is closing the webdriver
				driver.close();
	}

}
