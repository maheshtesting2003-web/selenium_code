package working_with_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\User\\OneDrive\\Desktop\\Sneha_M_Y_FlowCV_Resume_2026-04-06.pdf");

		Thread.sleep(5000);

		driver.quit();
	}
}
