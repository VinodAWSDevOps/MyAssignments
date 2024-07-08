package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountNoSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElement(By.partialLinkText("Accounts")).click();
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		//Clicking on Create Account button on Navigation panel
		driver.findElement(By.linkText("Create Account")).click();
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		//Entering the account name
		driver.findElement(By.id("accountName")).sendKeys("Selenium Testing Done");
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		//Entering the description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		//Entering the Number of Employees
		driver.findElement(By.id("numberEmployees")).sendKeys("21");
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		//Entering the Site name
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		//Clicking on  Create Account button
		driver.findElement(By.className("smallSubmit")).click();
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		String actname = driver.findElement(By.className("tabletext")).getText();
		System.out.println(actname);
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		//Closing the Chrome webdriver
		driver.close();
	}

}
