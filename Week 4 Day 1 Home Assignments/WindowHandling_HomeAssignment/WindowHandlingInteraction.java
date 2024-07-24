package week4.Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingInteraction {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		String parent_window = driver.getWindowHandle();
		System.out.println(parent_window);
		Set<String> windowhandles = driver.getWindowHandles();
		for (String string : windowhandles) 
		{
			System.out.println(string);
		}
		List<String> windows = new ArrayList<String>(windowhandles);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		Set<String> windowhandles2 = driver.getWindowHandles();
		for (String string : windowhandles2) 
		{
			System.out.println(string);
		}
		List<String> windows2 = new ArrayList<String>(windowhandles2);
		driver.switchTo().window(windows2.get(1));
		driver.findElement(By.xpath("(//a[text()='DemoLBCust'])")).click();
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(50000);
		driver.quit();

	}

}
