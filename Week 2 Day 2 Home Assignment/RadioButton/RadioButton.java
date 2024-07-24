package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("------Your most favorite browser------");
		Thread.sleep(2000);
		WebElement brw = driver.findElement(By.xpath("//label[text()='Chrome']"));
		brw.click();
		String bname = brw.getText();
		System.out.println("Browser selected is : "+bname);
		
		System.out.println("------UnSelectable------");
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		Thread.sleep(2000);
		WebElement unselrad = driver.findElement(By.xpath("//label[text()='Bengaluru']"));
		unselrad.isSelected();
		Boolean b = unselrad.isSelected();
		System.out.println(b);
		
		System.out.println("------Find the default select radio button------");
		WebElement defbrw = driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		String db = defbrw.getText();
		System.out.println("The default select radio button is : " +db);
		
		System.out.println("------Select the age group (only if not selected)------");
	    WebElement agegroup = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-bullet'])[2]"));
		Boolean bw = agegroup.isSelected();
		System.out.println(bw);
		Thread.sleep(2000);
	    if(b==false)
			System.out.println("Age group radio button is already selected");
			else
		{
			driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-bullet'])[2]")).click();
		}
	    Thread.sleep(1000);
		driver.close();
	}

}
