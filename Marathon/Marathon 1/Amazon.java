package marathon1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='bags for boys'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		Thread.sleep(2000);
		System.out.println("Total number of result is : "+result);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[12]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
		Thread.sleep(2000);
		String first_bagname = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText();
		System.out.println("The name of the first bag is : "+first_bagname);
		Thread.sleep(2000);
		String discounted_price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("The discounted price of bag is : "+discounted_price);
		String title = driver.getTitle();
		System.out.println("The title of web page is : "+title);
		Thread.sleep(2000);
		driver.close();
	}

}
