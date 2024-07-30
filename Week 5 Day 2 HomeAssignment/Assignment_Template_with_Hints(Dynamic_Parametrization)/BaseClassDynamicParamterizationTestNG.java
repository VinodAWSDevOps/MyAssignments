package week5.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClassDynamicParamterizationTestNG {

	public RemoteWebDriver driver;
	public ChromeOptions option;
	
	@Parameters({"username","password","URL","Browser"})
	@BeforeMethod
	public void preCondition(String uname, String pwd, String url,String browser)  {
		option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		switch(browser)
		{
		case "chrome":
			driver=new ChromeDriver(option);
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "ie":
			driver=new InternetExplorerDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		default:
			driver=new ChromeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
	}

	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
}
