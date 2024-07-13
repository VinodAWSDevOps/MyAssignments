package week3.day2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementingListInterface {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String itemcount = driver.findElement(By.xpath("//div[@class='filter']//strong")).getText();
		System.out.println("------Implementing List Interface------");
		System.out.println(itemcount);

		List<WebElement> brandnames = driver.findElements(By.xpath("//div[@class='brand']//strong"));
		System.out.println("Total Brand names available are : "+brandnames.size());
		System.out.println("------Below are the List of brand names------");
		for (int i = 0; i < brandnames.size(); i++) {
			String brand_names_list = brandnames.get(i).getText();
			System.out.println(brand_names_list);

		}
		List<WebElement> bag_names = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("Total number of bag names available are : "+bag_names.size());
		System.out.println("------Below are the List of Bag name avaialbe for different brands------");
		for (int i = 0; i < bag_names.size(); i++) {
			String bga_names_branded = bag_names.get(i).getText();
			System.out.println(bga_names_branded);
		}
		Thread.sleep(1000);
		driver.close();

	}

}
