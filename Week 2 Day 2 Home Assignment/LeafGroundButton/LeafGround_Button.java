package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class LeafGround_Button {

	public static void main(String[] args) throws InterruptedException {
		String pagetitle ="Dashboard";

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println("Web page title is : " +title);
		if(title.contentEquals(pagetitle))
		{
			System.out.println("The page title verified successfully");
		}
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		Boolean disablebtn = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if(disablebtn==true)
		{
			System.out.println("Button is disabled : "+disablebtn);
		}
		WebElement p = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		Point po = p.getLocation();
		System.out.println("The position of submit button are : "+po);

		WebElement save = driver.findElement(By.xpath("//span[text()='Save']"));	
		String bgc = save.getCssValue("background-color");
		String bgch = Color.fromString(bgc).asHex();
		System.out.println("The Background color of Save button is : "+bgch);
		WebElement submitbtn = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		int sbtn_Height = submitbtn.getSize().getHeight();
		int sbtn_Weight = submitbtn.getSize().getWidth();
		System.out.println("The Height of the Submit button is : "+sbtn_Height);
		System.out.println("The Width of the Submit button is : "+sbtn_Weight);
		Thread.sleep(1000);
		driver.close();

	}

}
