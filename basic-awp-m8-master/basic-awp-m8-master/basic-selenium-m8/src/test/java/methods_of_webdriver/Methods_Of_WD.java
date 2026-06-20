package methods_of_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Of_WD {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		
//		to Load a new web page in the current browser window.
		driver.get("https://www.facebook.com/"); // InvalidArgumentException
		
//		to Get the title of the current page.
		String title = driver.getTitle();
		System.out.println(title);
		
//		to Get a string representing the current URL that the browser is looking at.
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
//		to Get the source code of the last loaded page.
//		String sourceCode = driver.getPageSource();
//		System.out.println(sourceCode);
		
		Thread.sleep(5000);
		
//		close the current window, will not stop the server
//		driver.close();

//		closes all the windows, will stop the server
		driver.close();
		
		driver.close();
		
		
	}
}
