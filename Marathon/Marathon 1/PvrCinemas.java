package marathon1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//div[@class='cities-overlay cities-active'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@data-pc-section='input'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='p-dropdown-item'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='PR.PREMIERE|A:2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(2000);
		WebElement seatinfo = driver.findElement(By.xpath("//p[text()='PREMIERE']"));
		String si = seatinfo.getText();
		System.out.println("Seat Info : ");
		System.out.println("-------------------------");
		System.out.println(si);
		WebElement sn = driver.findElement(By.xpath("//div[@class='seat-number']/p"));
		String seatnumber = sn.getText();
		System.out.println(seatnumber);
		System.out.println("-------------------------");
		WebElement gt = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']/h6/span"));
		String grandtotal = gt.getText();
		System.out.println("Grand Total is : " +grandtotal);
		driver.findElement(By.xpath("//button[@class='sc-kpDprT RJaia btn-proceeded']")).click();
		Thread.sleep(2000);
		//Pop up Closed
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		//Printing the Title of web page
		String title = driver.getTitle();
		System.out.println("The web page Title is : "+title);
		//Close the browser driver
		Thread.sleep(1000);
		driver.close();
	}

}
