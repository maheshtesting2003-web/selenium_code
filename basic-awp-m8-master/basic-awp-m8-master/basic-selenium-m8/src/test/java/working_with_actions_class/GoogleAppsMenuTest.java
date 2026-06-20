package working_with_actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAppsMenuTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");

		WebElement appsButton = driver.findElement(By.cssSelector("a[aria-label='Google apps']"));
		appsButton.click();

		WebElement appsIframe = driver.findElement(By.cssSelector("iframe[name='app']"));
		driver.switchTo().frame(appsIframe);

		WebElement calendarSpan = driver.findElement(By.xpath("//span[@data-text='Calendar']"));
		calendarSpan.click();

		driver.switchTo().defaultContent();
		driver.quit();
	}

}