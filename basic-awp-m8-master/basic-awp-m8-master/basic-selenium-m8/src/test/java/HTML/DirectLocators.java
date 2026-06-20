package HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

//		enter username
//		WebElement un = driver.findElement(By.id("qspiders")); // NoSuchElementException
//		un.sendKeys("admin");

		driver.findElement(By.name("pass")).sendKeys("1234567890");

//		driver.findElement(By.linkText("Meta Pay")).click();

		Thread.sleep(3000);
		
//		WebElement metaPay = driver.findElement(By.linkText("Pay"));
		WebElement metaPay = driver.findElement(By.partialLinkText("Meta"));
		metaPay.click();

		Thread.sleep(8000);
		driver.quit();
	}
}
