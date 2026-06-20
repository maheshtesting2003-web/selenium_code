package initial_days;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Line_of_Code {
	
	// CTRL + SPACE => auto suggestion
	// Ctrl + shift + o => auto import
	
	public static void main(String[] args) {
//		ChromeDriver cd = new ChromeDriver();
//		EdgeDriver ed = new EdgeDriver();
//		FirefoxDriver ffd = new FirefoxDriver();
		
//		which will create random memory space, in heap area
//		1. launch the empty chrome browser
//		2. start the server
//		3. load, reg. and re-initialize the non static members
		
		
//		upcasting
//		WebDriver driver1 = new ChromeDriver();
//		WebDriver driver2 = new EdgeDriver();
//		WebDriver driver3 = new FirefoxDriver();
		
//		poly-morphism(runtime)
		WebDriver driver = new ChromeDriver();
//					driver = new EdgeDriver();
//					driver = new FirefoxDriver();
		
		driver.get("www.facebook.com");
				
	}
}
