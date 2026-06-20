package HTML;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAndTag {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://automationwithpiyush.vercel.app/locators.html");
//		
//		driver.findElement(By.className("lab-input")).sendKeys("1234567890");
		
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("z"));
		
		int numOfLinks = links.size();
		System.out.println(numOfLinks);
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
