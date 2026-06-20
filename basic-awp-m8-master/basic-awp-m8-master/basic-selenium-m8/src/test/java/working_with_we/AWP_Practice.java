package working_with_we;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_Practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://automationwithpiyush.vercel.app/elements.html");
		
		WebElement sunCheck = driver.findElement(By.id("sunday"));
		
		String idOfSunCheck = sunCheck.getAttribute("id");
		System.out.println(idOfSunCheck);
		
		String accentColorOfSunCheck = sunCheck.getCssValue("accent-color");
		System.out.println(accentColorOfSunCheck);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
