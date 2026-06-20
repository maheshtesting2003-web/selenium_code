package locator_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_FindElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("C:/Users/User/Basic_Selenium/basic-selenium-a4/src/test/java/HTML/boilerplate.html");
		
		WebElement un = driver.findElement(By.id("username")); //NoSuchElementException
//		List<WebElement> uns = driver.findElements(By.id("username")); // No exception
		
//		get the webelement for password field
		
		WebElement pwd = driver.findElement(By.name("pass"));
		
//		Thread.sleep(2000);
			   
		un.sendKeys("admin");
		pwd.sendKeys("1234567890");
		
//		Thread.sleep(2000);
		
//		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
//		WebElement link = driver.findElement(By.partialLinkText("F"));
//		link.click();	 
	
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
//		driver.navigate().to("https://automationwithpiyush.vercel.app/locators.html");
//		
//		List<WebElement> images = driver.findElements(By.className("avatar-image"));
//		System.out.println(images.size());
		
		driver.navigate().to("https://www.naukri.com/");
		driver.findElement(By.className("nI-gNb-lg-rg__login")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
