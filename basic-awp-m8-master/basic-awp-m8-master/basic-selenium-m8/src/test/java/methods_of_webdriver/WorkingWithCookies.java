package methods_of_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithCookies {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();

//		initialization
		Cookie loginck = driver.manage().getCookieNamed("PHPSESSID");

		Thread.sleep(2000);

		driver.quit();

		Thread.sleep(2000);

		driver = new EdgeDriver();
		driver.get("http://localhost:8888/");

//		utilization
		driver.manage().addCookie(loginck);
		
		Thread.sleep(2000);

		driver.navigate().refresh();

		Thread.sleep(10000);

		driver.quit();

	}
}
