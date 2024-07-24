package week4.Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonActionInteraction {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro"+Keys.ENTER);
		String price_Of_first_product = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("------AmazonActions------");
		System.out.println("The price of the first product is : "+price_Of_first_product);
		String no_Of_Customer_Rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("The Number of customer ratings is : "+no_Of_Customer_Rating);

		String winodwHandle = driver.getWindowHandle();
		driver.switchTo().window(winodwHandle);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			System.out.println(string);
		}
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("(//span[@id='submit.add-to-cart'])[2]")).click();
		Thread.sleep(5000);
		String subTotal_Cart = driver.findElement(By.xpath("(//span[@id='attach-accessory-cart-subtotal'])[1]")).getText();
		System.out.println("The cart amount is : "+subTotal_Cart);
		String regex = "₹";
		String regex_DecimalPoint = ".00";
		String Cart_Amount = subTotal_Cart.replaceFirst(regex, "");
		String addToCart_Amount = Cart_Amount.replaceFirst(regex_DecimalPoint,"");
		if(price_Of_first_product.equals(addToCart_Amount))
		{
			System.out.println("Price is correctly displayed in the cart");
		}
		driver.quit();
	}

}
