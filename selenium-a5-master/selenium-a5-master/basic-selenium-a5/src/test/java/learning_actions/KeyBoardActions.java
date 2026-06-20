package learning_actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
		act.sendKeys("admin").build().perform();

//		act.keyDown(Keys.CONTROL).perform(); //key press
//		act.sendKeys("a").perform();
//		act.keyUp(Keys.CONTROL).perform(); //key release

		act.keyDown(Keys.CONTROL)
			.sendKeys("a")
			.keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("qwertyuio").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
