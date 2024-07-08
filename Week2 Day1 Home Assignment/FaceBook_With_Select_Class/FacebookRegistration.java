package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Tested");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Test@123");
		WebElement dateofbirth = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dob = new Select(dateofbirth);
		dob.selectByIndex(21);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select mth = new Select(month);
		mth.selectByIndex(11);

		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select yr = new Select(year);
		yr.selectByValue("1988");

		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();

		Thread.sleep(1000);
		driver.close();
	}

}
