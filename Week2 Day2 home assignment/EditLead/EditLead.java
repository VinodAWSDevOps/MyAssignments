package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("ABC India pvt ltd");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Software");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Engineer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("King");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Home Assignment");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Testing@gmail.com");
		Thread.sleep(1000);
		WebElement dd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(dd);
		state.selectByVisibleText("New York");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("updateLeadForm_description")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is automation testing selenium and java");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println("The webpage title is : "+title);
		Thread.sleep(1000);
		driver.close();
	}

}
