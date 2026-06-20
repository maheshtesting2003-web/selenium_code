package working_with_jse;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoArgs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://www.zomato.com/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		String url1 = "https://www.facebook.com/";
		String url2 = "https://www.zomato.com/";
		String url3 = "https://www.instagram.com/";

//		jse.executeScript("window.location= '" + url3 + "' ;");
		jse.executeScript("window.location= arguments[2] ;", url1,url2,url3);
		jse.executeScript("window.location= arguments[1] ;", url1,url2,url3);
		jse.executeScript("window.location= arguments[0] ;", url1,url2,url3);

		Thread.sleep(3000);
		driver.quit();
	}
}
