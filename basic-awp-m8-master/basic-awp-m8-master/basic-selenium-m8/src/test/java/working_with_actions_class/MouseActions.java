package working_with_actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/actions.html");
		
		Actions act = new Actions(driver);
		
//		WebElement hover = driver.findElement(By.xpath("//button[contains(text(),'Hover')]"));
//		act.moveToElement(hover).build().perform();
//		
//		Thread.sleep(500);
//		
//		WebElement leftClick = driver.findElement(By.id("click-icon"));
//		act.click(leftClick).build().perform();
//		
//		Thread.sleep(500);
//		
//		WebElement rightClick = driver.findElement(By.id("right-click-area"));
//		act.contextClick(rightClick).build().perform();
//		
//		Thread.sleep(500);
//		
//		WebElement dbClick = driver.findElement(By.id("db-icon"));
//		act.doubleClick(dbClick).perform();
//		
//		WebElement hold = driver.findElement(By.id("hold-icon"));
////		act.clickAndHold(hold).build().perform();
////		
////		Thread.sleep(3000);
////		
////		act.release().build().perform();
//		
//		act.clickAndHold(hold).pause(Duration.ofSeconds(3)).release().build().perform();
////			return => Actions    resource => Actions
//		
		WebElement scrollTo = driver.findElement(By.xpath("//h3[text()='07. Range Slider']"));
		
		act.scrollToElement(scrollTo).perform();
		
//		dragAndDropBy(src,x,y) , need to check website (Having bug)
		WebElement laptop = driver.findElement(By.id("prod-laptop"));
//		act.dragAndDrop(laptop, 200,70).build().perform();		
//		act.clickAndHold(laptop).moveByOffset(100,0).release().build().perform();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
