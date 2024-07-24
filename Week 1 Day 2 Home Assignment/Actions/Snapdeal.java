package week4.Day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.compress.harmony.pack200.NewAttributeBands.Integral;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("(//span[normalize-space()=\"Men's Fashion\"])")).click();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();

		List<WebElement> noOfShoes = driver.findElements(By.xpath("(//div[@class='child-cat-count '])[1]"));
		System.out.println("------Snapdeal------");
		for (int i = 0; i < noOfShoes.size(); i++) {
			String shoe_count = noOfShoes.get(i).getText();
			System.out.println("Count of Sports shoe : "+shoe_count);
		}
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sorting-sec animBounce']//ul/li[2]")).click();
		String lowPrice = driver.findElement(By.xpath("//span[@class='from-price-text']")).getText();
		System.out.println(lowPrice);
		String highPrice = driver.findElement(By.xpath("//span[@class='to-price-text']")).getText();
		System.out.println(highPrice);
		String regex_low = lowPrice.replaceFirst("Rs. ", "");
		String regex_high = highPrice.replaceFirst("Rs. ", "");
		int low = Integer.parseInt(regex_low);
		int high = Integer.parseInt(regex_high);
		if(low<high)
		{
			System.out.println("Products are sorted from LOW to HIGH ");
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,300)");
		WebElement low_button = driver.findElement(By.xpath(("(//div[@class='filter-inner']//div)/a[1]")));
		Actions action = new Actions(driver);
		Thread.sleep(4000);
		action.dragAndDropBy(low_button, 3, 0).perform();
		WebElement high_button = driver.findElement(By.xpath("(//div[@class='filter-inner']//div)/a[2]"));
		Thread.sleep(4000);
		action.dragAndDropBy(high_button, -193, 0).perform();
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,300)");
		jse.executeScript("window.scrollBy(0,500)");
		
		WebElement color = driver.findElement(By.xpath("//div[@data-name='Color_s']//a[text()=' White & Blue']"));
		action.click(color).perform();
		
		jse.executeScript("window.scrollBy(0,-800)");
		String lAMT = driver.findElement(By.xpath("//span[@class='from-price-text']")).getText();
		String low1 = lAMT.replaceFirst("Rs ", "");
		System.out.println(low1);
		String hAMT = driver.findElement(By.xpath("//span[@class='to-price-text']")).getText();
		String high1 = hAMT.replaceFirst("Rs ", "");
		System.out.println(high1);
		String verify_amt = driver.findElement(By.xpath("(//a[@data-key='Price|Price'])[1]")).getText();
		String filter_low_amt = verify_amt.replaceFirst("Rs. ", "");
		String filter_high_amt = filter_low_amt.replaceAll(" Rs. ", "");
		String lValue = filter_high_amt.substring(0, 3);
		System.out.println(lValue);
		String hValue = filter_high_amt.substring(5, 8);
		System.out.println(hValue);
		int lowAMOUNT = Integer.parseInt(low1);
		int highAMOUNT = Integer.parseInt(high1);
		int fla = Integer.parseInt(lValue);
		int fha = Integer.parseInt(hValue);
		if((lowAMOUNT==fla)&&(highAMOUNT==fha))
		{
			System.out.println("Amount filter verified successfully");
		}
		WebElement firstShoe = driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"));
		action.moveToElement(firstShoe).perform();
		//driver.findElement(By.xpath("(//picture[@class='picture-elem'])[1]")).click();
		
		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);
		driver.findElement(By.xpath("(//picture[@class='picture-elem'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String costofShoe : windowHandles) {
			System.out.println(costofShoe);
		}
		
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		String shoeCost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("The cost of the shoe is : "+shoeCost);
		String discountPrice = driver.findElement(By.xpath("//span[@class='pdpDiscount ']")).getText();
		System.out.println("The discount price is : "+discountPrice);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snap/snapdeal.jpg");
		FileUtils.copyFile(screenshotAs, desc);
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
