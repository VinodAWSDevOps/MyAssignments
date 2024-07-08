package week2.day2.assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
		Thread.sleep(1000);
		//String message = "Checked";
		WebElement verifymessage = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		String vm = verifymessage.getText();
		System.out.println(vm);
		if(vm.equals("Checked"))
		{
			System.out.println("Basic Checkbox and Ajax Checkbox is selected");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		WebElement state = driver.findElement(By.xpath("//div[@class='ui-growl-message']//p"));
		String st = state.getText();
		System.out.println(st);
		System.out.println("The state of tri-state checkbox is : "+st);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']")).click();
		Thread.sleep(2000);
		WebElement vermsg = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		Thread.sleep(2000);
		String vmsg = vermsg.getText();
		System.out.println(vmsg);
		if(vmsg.equals("Checked"))
		{
			System.out.println("Verified message successfully");
		}
		Boolean cd = driver.findElement(By.xpath("//input[@aria-disabled='true']")).isEnabled();
		System.out.println("The Verify if check box is disabled :"+cd);
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[11]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[7]")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
