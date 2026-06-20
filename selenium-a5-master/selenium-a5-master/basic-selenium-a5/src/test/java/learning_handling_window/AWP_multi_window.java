package learning_handling_window;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_multi_window {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/");

//		1> 	
		String PID = driver.getWindowHandle();

//		2>
		driver.findElement(By.cssSelector("button[onclick='openSocialChannels()']")).click();

//		3>
		Set<String> CIDs = driver.getWindowHandles();

//		4>
		for (String i : CIDs) {
			driver.switchTo().window(i);
			System.out.println(i);
			Thread.sleep(2000);

//		5>
			if (driver.getCurrentUrl().contains("github")) {
				break;
			}
		}
		
//		6>
		Thread.sleep(5000);
		driver.close();
		
//		7>
		Thread.sleep(3000);
		driver.switchTo().window(PID).quit();

	}

}
