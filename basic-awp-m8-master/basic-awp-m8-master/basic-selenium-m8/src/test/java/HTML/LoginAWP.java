package HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAWP {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationwithpiyush.vercel.app/locators.html");
		
		/*
		 * #id
		 * .class
		 * 
		 * tagname[attName = 'attValue']
		 * 
		 *  
		 * parent(#id/.class/tag) child(#id/.class/tag)
		*/		
//		un & pwd
		driver.findElement(By.cssSelector("#email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("1234567890");
		
//		checkbox
		driver.findElement(By.cssSelector(".custom-checkbox")).click();

//		uncheck
		driver.findElement(By.cssSelector(".items-center #terms_checkbox")).click();

		Thread.sleep(2000);
		
//		login button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
