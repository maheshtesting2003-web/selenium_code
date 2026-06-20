package locator_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LearnRelativeLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.easemytrip.com/");
		
		driver.findElement(By.id("ddate")).click();
		
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//li[text()='1']")).click();
		
		WebElement oneOfMay = driver.findElement(
							RelativeLocator
					        .with(By.xpath("//li[text()='1']")) // target
					        
					        .above(By.id(null))
					        .below(By.xpath("//div[text()='May 2026']"))
					        .toLeftOf(By.id(null))
					        .toRightOf(By.id(null))
					        
				);
		
		oneOfMay.click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
