package learning_JSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://www.zomato.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.location='https://www.zomato.com/';");

// 		jse.executeScript("window.scrollTo(0, 500)");
// 		Thread.sleep(1000);
// 		jse.executeScript("window.scrollBy(0, 500)");
// 		Thread.sleep(1000);
// 		jse.executeScript("window.scrollTo(0, 500)");

// 		jse.executeScript("window.location='https://automationwithpiyush.vercel.app/locatorsSignin.html';");
//
//// 		alternative of sendKeys()
// 		jse.executeScript("document.getElementById('email').value='admin';");
//// 		alternative of click() 		
// 		jse.executeScript("document.getElementById('terms_checkbox').click();");

//		arguments[]
// 		WebElement username = driver.findElement(By.id("email"));
// 		WebElement tac = driver.findElement(By.id("terms_checkbox"));

// 		jse.executeScript("arguments[1].click();",username , tac);
// 		jse.executeScript("arguments[0].value='admin';", username, tac);

		WebElement blinkit = driver.findElement(By.xpath("//div[text()='blinkit']"));
		jse.executeScript("arguments[0].scrollIntoView(false)", blinkit);

		Thread.sleep(2000);

		jse.executeScript("arguments[0].scrollIntoView(true)", blinkit);

		
		WebElement link = driver.findElement(By.linkText("Restaurant Consulting"));
		jse.executeScript("arguments[0].scrollIntoView(true)", link);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
