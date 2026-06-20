package learning_dd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AWP_dd {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/signup.html");

//		get the webelement reference of DD
		WebElement dayDD = driver.findElement(By.id("day"));

//		create the object for Select <<C>>	
		Select selDay = new Select(dayDD);

//		perform the task

//		selDay.selectByIndex();
//		selDay.selectByValue("2");
		selDay.selectByValue("2");

//		selDay.deselectByValue("2"); // UnsupportedOperationException: You may only deselect options of a multi-select

//		if (selDay.isMultiple()) {
//			selDay.deselectAll();
//		}

		driver.navigate().to("C:/Users/User/git/a5BasicWeekend/basic-selenium-a5/src/test/java/HTML/dd.html");

//		get the webelement reference of DD
		WebElement langDD = driver.findElement(By.id("Langs"));

//		create the object for Select <<C>>	
		Select selLang = new Select(langDD);

//		perform the task
		selLang.selectByIndex(0);
		selLang.selectByIndex(1);
		selLang.selectByIndex(2);

//		get the first option(element) selected
		WebElement ele = selLang.getFirstSelectedOption();
		System.out.println(ele.getText());

		List<WebElement> eles = selLang.getAllSelectedOptions();
		System.out.println(eles.size());

		Thread.sleep(2000);
		if (selLang.isMultiple()) {
			selLang.deselectAll();
		}

		Thread.sleep(3000);
		driver.quit();
	}
}
