package learning_actions;

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
//		InvalidArgumentsException

		Thread.sleep(2000);
//		//tagname[contains(text(), 'partial unique visibletext')]
		WebElement hoverEle = driver.findElement(By.xpath("//button[contains(text(), 'Hover')]"));

//		create an object for Actions class

//		Select sel = new Select(element);
		Actions act = new Actions(driver);

//		hover
//		act.moveToElement(hoverEle).perform();

		WebElement clickEle = driver.findElement(By.id("click-box"));

//		left click
//		act.moveToElement(clickEle).click().build().perform(); // clicks on the location where we put mouse pointer 
//		act.click(clickEle).build().perform(); // clicks on the element we've passed

		WebElement doubleEle = driver.findElement(By.id("double-click-area"));

//		double click
//		act.moveToElement(doubleEle).doubleClick().build().perform(); // clicks on the location where we put mouse pointer 
//		act.doubleClick(doubleEle).build().perform(); // clicks on the element we've passed

		WebElement righClickEle = driver.findElement(By.id("right-click-area"));

//		right click
//		act.moveToElement(righClickEle).contextClick().build().perform(); // clicks on the location where we put mouse pointer 
//		act.contextClick(righClickEle).build().perform(); // clicks on the element we've passed

		WebElement clickHoldEle = driver.findElement(By.id("click-hold"));

//		click and hold and release
//		act.moveToElement(clickHoldEle).clickAndHold().build().perform();
//		act.clickAndHold(clickHoldEle).pause(Duration.ofSeconds(3)).release().build().perform();

		WebElement laptop = driver.findElement(By.id("prod-laptop"));
		WebElement destination = driver.findElement(By.id("cart-zone"));
		
//		drag and drop
//		act.moveToElement(laptop).clickAndHold().moveToElement(destination).release().build().perform();
//		act.dragAndDrop(laptop, destination).build().perform();
//		act.dragAndDropBy(laptop, 300, 0).build().perform();

//		slider or seekbar
//		need to check the webpage
		
//		act.scrollByAmount(0, 100)
//				.pause(Duration.ofSeconds(1))
//				.scrollByAmount(0, 100)	
//				.pause(Duration.ofSeconds(1))
//				.scrollByAmount(0, 100)		
//				.pause(Duration.ofSeconds(1))
//				.scrollByAmount(0, 100).build().perform();		
			
		WebElement p = driver.findElement(By.xpath("//p[contains(text(),'2026')]"));
		act.scrollToElement(p).build().perform();
		
//		build is used to build the actions
//		perform is used to perform the actions

		Thread.sleep(7000);
		driver.quit();
	}
}
