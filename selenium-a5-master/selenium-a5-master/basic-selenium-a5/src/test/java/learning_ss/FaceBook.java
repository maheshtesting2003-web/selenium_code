package learning_ss;

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

public class FaceBook {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://facebook.com/");

		Thread.sleep(2000);

//		webpage ka ss	
//		1> downcasting
		TakesScreenshot tks = (TakesScreenshot) driver;

//		2> take ss
		File source = tks.getScreenshotAs(OutputType.FILE);

//		3> create the "java representation object" of the physical file
		File destination = new File("./errorShots/ss.png");
		// . means project level, / means child

//		4> copy to destination
		FileHandler.copy(source, destination);

//		web element ka ss
		WebElement login = driver.findElement(By.cssSelector("div[aria-label='Log in']"));
		File source1 = login.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("./errorShots/login.png");
		FileHandler.copy(source1, destination1);

		System.out.println("ss taken successfully !!!");
		driver.quit();
	}
}