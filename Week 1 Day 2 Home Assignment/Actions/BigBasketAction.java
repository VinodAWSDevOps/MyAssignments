package week4.Day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BigBasketAction {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']")).click();
		Actions action = new Actions(driver);
		WebElement foodgrains_Oil_Masala = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Thread.sleep(2000);
		action.moveToElement(foodgrains_Oil_Masala).perform();		
		WebElement rice_Rice_Products = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		Thread.sleep(2000);
		action.moveToElement(rice_Rice_Products).perform();
		WebElement boiledSteamRice = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		Thread.sleep(2000);
		action.moveToElement(boiledSteamRice).perform();
		boiledSteamRice.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@placeholder='Search here'])[1]")).sendKeys("BB Royal");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='i-BBRoyal'])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//h3[normalize-space()='Tamil Ponni Boiled Rice'])[1]")).click();


		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);
		driver.findElement(By.xpath("(//h3[normalize-space()='Tamil Ponni Boiled Rice'])[1]")).click();

		Set<String> windowhandles = driver.getWindowHandles(); 
		for (String string : windowhandles) 
		{ 
			System.out.println(string); 
		}

		List<String> windows = new ArrayList<String>(windowhandles);
		driver.switchTo().window(windows.get(1));

		WebElement fivekg =driver.findElement(By.xpath("//span[text()='5 kg']"));
		driver.executeScript("arguments[0].click()", fivekg);

		String fiveKg_price = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']")).getText();
		System.out.println("The price of 5Kg rice is : "+fiveKg_price);
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();

		//String successMessage = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']")).getText();
		//System.out.println(successMessage);
		driver.switchTo().window(windows.get(0));
		Thread.sleep(2000);


		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snap/img.jpg");
		FileUtils.copyFile(screenshotAs, desc);



		driver.quit();

	}

}
