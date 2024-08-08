package marathon3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {

	public ChromeDriver driver;
	public ChromeOptions option;
	String excelPath;
	String sheetName;

	@Parameters({"username","password"})
	@BeforeMethod
	public void preCondition(String uname,String pwd)
	{
		option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@DataProvider(name="sendData")
	public Object[][] getData()
	{
		//String excelPath="./data/Marathon3Create.xlsx";
		return ExcelDataProvider.testData(excelPath, sheetName);
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
}
