package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Leads")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		WebElement first_leadId = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		String fli = first_leadId.getText();
		System.out.println("The Lead ID is : "+fli);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(fli);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		WebElement norecords = driver.findElement(By.xpath("//b[text()='© Testleaf 2024']"));
		String no_records = norecords.getText();
		System.out.println("There aree no records and message dispalyed is : "+no_records);
		if(no_records.equalsIgnoreCase("© Testleaf 2024"))
		{
			System.out.println("The Lead ID is successfully Deleted");
		}
		Thread.sleep(1000);
		driver.close();
	}

}
