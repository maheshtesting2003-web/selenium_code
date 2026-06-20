package working_with_dd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDD {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("C:/Users/User/git/basic-14/basic-selenium-a14/src/test/java/HTML/dd.html");

		WebElement dayDD = driver.findElement(By.id("day"));

		Select selDay = new Select(dayDD);

		selDay.selectByIndex(0);
		Thread.sleep(1000);
//		selDay.deselectAll();

		WebElement hobbieDD = driver.findElement(By.id("hobbies"));

		Select selHob = new Select(hobbieDD);

		selHob.selectByValue("r");
		Thread.sleep(1000);
		selHob.selectByValue("s");
		selHob.selectByValue("m");

		WebElement firstSelected = selHob.getFirstSelectedOption();
//		System.out.println(firstSelected.getText());

		List<WebElement> selected = selHob.getAllSelectedOptions();

		for (WebElement i : selected) {
			System.out.println(i.getText());
		}

		Thread.sleep(2000);

		boolean status = selHob.isMultiple();

		if (status) {
			selHob.deselectAll();
		}

		Thread.sleep(3000);
		driver.quit();
	}
}
