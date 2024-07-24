package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.partialLinkText("Accounts")).click();
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		//Clicking on Create Account button on Navigation panel
		driver.findElement(By.linkText("Create Account")).click();
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		//Entering the account name
		driver.findElement(By.id("accountName")).sendKeys("Selenium Testing10");
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		//Entering the description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		//Entering the Site name
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		//Entering the Number of Employees
		driver.findElement(By.id("numberEmployees")).sendKeys("21");
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		
		//Selecting the industry dropdown element
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select dd = new Select(industry);
		dd.selectByIndex(3);
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		
		//Selecting the ownership element
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select owndd = new Select(ownership);
		owndd.selectByVisibleText("S-Corporation");
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		
		//Selecting the source element
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select srcdd = new Select(source);
		srcdd.selectByValue("LEAD_EMPLOYEE");
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		
		//Selecting the Marketing Campaign element
		WebElement marcamp = driver.findElement(By.id("marketingCampaignId"));
		Select mcdd = new Select(marcamp);
		mcdd.selectByIndex(6);
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		
		//Selecting the State Campaign element
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select statedd = new Select(state);
		statedd.selectByValue("TX");
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		//Clicking on  Create Account button
		driver.findElement(By.className("smallSubmit")).click();
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		WebElement acn = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		String ac = acn.getText();
		System.out.println(ac);
		//Waiting to see the data loads to element
		Thread.sleep(1000);
		//Closing the Chrome webdriver
		driver.close();
	}

}
