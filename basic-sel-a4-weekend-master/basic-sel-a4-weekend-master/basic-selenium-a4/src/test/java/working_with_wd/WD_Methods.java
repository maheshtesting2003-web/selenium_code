package working_with_wd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		verification
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		if (title.contains("Facebook") && url.contains("facebook")) {
			System.out.println("Reached correct page");
		}else {
			System.out.println("try again....");
		}
		
//		String sourceCode = driver.getPageSource();
//		System.out.println(sourceCode);
		
		
		
		
		
		
		
		
		
//		driver.close(); //==> close the current window
//						====> will not stop the server
		
		Thread.sleep(4000);
		
		driver.quit(); //==>> Close all the windows
//						 ==>> stop the server
		
	}
}
