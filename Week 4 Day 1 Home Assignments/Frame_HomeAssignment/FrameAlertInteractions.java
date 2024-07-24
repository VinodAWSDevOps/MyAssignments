package week4.Day1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlertInteractions {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		String alert_text = alert.getText();
		System.out.println(alert_text);
		alert.accept();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		String alert_frame_text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(alert_frame_text);
		driver.close();

	}

}
