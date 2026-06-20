package working_with_ss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebook {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://facebook.com/");

		Thread.sleep(2000);

//		downcasting
		
//		dummy file ka JRO => create new folder(right click on project => new => folder)
//							 create new file(right click on folder => new => file => name must be end with ".png")
		
//		path => right click on file => properties 
//				copy the path for ex:- /basic-selenium-m8/error_shots/fb.png
//						modify it to:- ./error_shots/fb.png (. represents project level)

		
//		WebDriver driver = new ChromeDriver();

//		take ss of web page
		TakesScreenshot tks = (TakesScreenshot) driver;

		File src = tks.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./error_shots/fbWebPage.png");

		FileHandler.copy(src, dest);

//		take ss of web element		
		WebElement loginBtn = driver.findElement(By.xpath("//span[text()='Log in']"));
		
		File src1 = loginBtn.getScreenshotAs(OutputType.FILE);
		
		File dest1 = new File("./error_shots/loginBtn.png");
		
		FileHandler.copy(src1, dest1);
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
