package working_with_popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(setting);
			
		driver.get("https://www.easemytrip.com/");
		
		Thread.sleep(10000);
		driver.quit();
	}
}
