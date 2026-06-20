package learning_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider/");

//		to get into first indexed frame	
		driver.switchTo().frame(0);

		WebElement slider = driver.findElement(By.id("slider"));

		Actions act = new Actions(driver);

		act.moveToElement(slider).moveByOffset(0, 0).click().build().perform();

		Thread.sleep(2000);

		act.moveToElement(slider, 100, 0).click().build().perform();

		Thread.sleep(2000);

		act.moveToElement(slider, -100, 0).click().build().perform();

		Thread.sleep(3000);
		driver.quit();
	}
}
