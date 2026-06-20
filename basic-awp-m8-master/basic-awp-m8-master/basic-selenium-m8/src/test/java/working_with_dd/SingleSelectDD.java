package working_with_dd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDD {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/signup.html");

		Thread.sleep(5000);
		
		WebElement dayDD = driver.findElement(By.id("day"));
		
		Select selDay = new Select(dayDD);
		
		selDay.selectByIndex(6);
//		selDay.selectByVisibleText("");
//		selDay.selectByValue("");
		
		List<WebElement> options = selDay.getOptions();
		System.out.println(options.size());
		
		for (WebElement i : options) {
			String date = i.getText();
			System.out.println(date);
		}
		

		Thread.sleep(3000);
		driver.quit();
	}
}
