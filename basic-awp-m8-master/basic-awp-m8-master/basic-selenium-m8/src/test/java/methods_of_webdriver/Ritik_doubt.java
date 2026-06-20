package methods_of_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ritik_doubt {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("www.facebook.com");
		
		Thread.sleep(2000);
		
		driver = new EdgeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.quit();
	}
}
