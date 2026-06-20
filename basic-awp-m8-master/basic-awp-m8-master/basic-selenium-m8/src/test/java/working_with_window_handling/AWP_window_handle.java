package working_with_window_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_window_handle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/");

//		step 1: get the home address
		String PID = driver.getWindowHandle();

//		step 2 : perform the task which opens the new window/s
		driver.findElement(By.xpath("//button[contains(text(),'Connect')]")).click();

//		step 3 : get all the addresses
		Set<String> CIDs = driver.getWindowHandles();

//		Step 4 : switch to every window by running foreach loop

		for (String i : CIDs) {
			driver.switchTo().window(i);

//			step 5 : check the condition and break the loop
			if (driver.getTitle().contains("Just")) {
				break;
			}
		}

//		step 6 : perform the task
		Thread.sleep(3000);
		driver.close();

//		step 7 : Come back home
		driver.switchTo().window(PID);

		Thread.sleep(5000);
		driver.quit();
	}
}
