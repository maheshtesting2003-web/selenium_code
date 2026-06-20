package methods_of_webdriver;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithCookies2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		Set<Cookie> cks = driver.manage().getCookies();
		
		for (Cookie cookie : cks) {
			System.out.println(cookie.getName());
		}
		
		Cookie ck = driver.manage().getCookieNamed("datr");
		System.out.println(ck);
		
		Thread.sleep(10000);
		
		driver.quit();
		
	}
}
