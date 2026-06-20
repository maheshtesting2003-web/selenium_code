package working_with_actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.zomato.com/");
		
		Thread.sleep(2000);
		WebElement checkItOut = driver.findElement(By.xpath("//div[contains(text(),'ordering your')]"));
		
//		new Actions(driver)
//			.scrollToElement(checkItOut)
//			.perform();
		
		new Actions(driver)
			.scrollByAmount(0, 500)
			.pause(Duration.ofSeconds(1))
			.scrollByAmount(0, 500)
			.pause(Duration.ofSeconds(1))
			.scrollByAmount(0, 500)
			.pause(Duration.ofSeconds(1))
			.perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
