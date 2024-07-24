package marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Actions action = new Actions(driver);
		WebElement brands = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		action.moveToElement(brands).click().perform();

		WebElement watches_Aceeseroies = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		action.moveToElement(watches_Aceeseroies).perform();

		WebElement casio = driver.findElement(By.xpath("(//div[text()='Casio'])[1]"));
		action.moveToElement(casio).click().perform();

		WebElement sortBy = driver.findElement(By.xpath("//div[@class='SelectBoxDesktop__base']"));
		sortBy.click();
		driver.findElement(By.xpath("//option[@label='New Arrivals']")).click();
		driver.findElement(By.xpath("(//div[@class='CheckBox__base'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		String paremtWindow = driver.getWindowHandle();
		System.out.println("---Marathon 2------");
		System.out.println("Parent Window : "+paremtWindow);

		List<WebElement> win = driver.findElements(By.xpath("(//div[@class='ProductDescription__priceHolder'])"));
		System.out.println("The total no. of watches on the webpage are : "+win.size());
		System.out.println("------Below are the list of watche price avaiable in this web page ------");
		for (int i = 0; i < win.size(); i++) 
		{
			String aWP_Page = win.get(i).getText();
			System.out.println(aWP_Page);
		}
		String first_Watch = win.get(0).getText();
		String regex_pwp="₹";
		String parentWindow_wp = first_Watch.replaceAll(regex_pwp, "");
		System.out.println("The First watch user selected price is : "+first_Watch);

		Set<String> windows = driver.getWindowHandles();
		for (String string : windows) 
		{
			System.out.println("Window addresses : "+string);
		}

		List<String> win1 = new ArrayList<String>(windows);
		driver.switchTo().window(win1.get(1));
		WebElement cWWatchPrice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']"));
		String childWindow_WatchPrice = cWWatchPrice.getText();
		String regex_cwp = "MRP: ₹";
		String childWindow_wp = childWindow_WatchPrice.replaceAll(regex_cwp, "");
		System.out.println("The Price in the Child window is : "+childWindow_wp);
		System.out.println("The Price in the Parent window is : "+parentWindow_wp);
		if(parentWindow_wp.equals(childWindow_wp))
		{
			System.out.println("The price in child window is equal to parent window ");
		}
		driver.findElement(By.xpath("(//span[@data-test='button'])[3]")).click();
		String bagCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("The No. of item added to Bag : "+bagCount);
		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();

		Thread.sleep(2000);
		driver.quit();
	}

}
