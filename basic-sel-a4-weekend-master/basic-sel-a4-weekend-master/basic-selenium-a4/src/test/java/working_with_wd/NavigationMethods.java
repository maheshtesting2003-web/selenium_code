package working_with_wd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		Navigation nav = driver.navigate();
		
		Thread.sleep(3000);
		
		nav.back();
		
		Thread.sleep(3000);

		nav.forward();
		
		Thread.sleep(3000);
		
		nav.refresh();
		
		Thread.sleep(3000);
		
		nav.to("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
