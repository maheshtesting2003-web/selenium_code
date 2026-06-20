package working_with_wd;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_cache_memory {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		
		Set<Cookie> cks = driver.manage().getCookies();
		
		for (Cookie ck : cks) {
			String name = ck.getName();
			System.out.println(name);
		}
		
		
		System.out.println(cks.size());
		
		Thread.sleep(3000);
		driver.quit();
	}
}
