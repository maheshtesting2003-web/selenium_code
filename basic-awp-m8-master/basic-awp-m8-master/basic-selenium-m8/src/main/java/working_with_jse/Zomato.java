package working_with_jse;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		JavascriptExecutor jse = (JavascriptExecutor) driver;

//		driver.get("https://www.zomato.com/");
		jse.executeScript("window.location='https://www.zomato.com/';");

		jse.executeScript("window.scrollTo(0,1500);");

//		jse.executeScript("window.scrollTo(0,2000);");
		jse.executeScript("window.scrollBy(0,500);");

//		fetch the title
		System.out.println(jse.executeScript("return document.title;"));

		Thread.sleep(3000);
		driver.quit();
	}
}
