package locator_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpressionsPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationwithpiyush.vercel.app/locators.html");
		
		
		WebElement username = driver.findElement(By.cssSelector("input[type='email']"));
		username.sendKeys("admin");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
