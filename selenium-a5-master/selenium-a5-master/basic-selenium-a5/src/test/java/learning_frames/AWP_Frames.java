package learning_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_Frames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/frames.html");

//		switch to the frame a
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("name_input")).sendKeys("John Cena");
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		
		driver.findElement(By.id("critical_check")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
