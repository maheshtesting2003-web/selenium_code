package methods_of_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

//		size
//		Dimension dim = driver.manage().window().getSize();
//		System.out.println(dim);
//
//		int w = dim.getWidth();
//		int h = dim.getHeight();
//		System.out.println(w + " and " + h);
//
//		Options opt = driver.manage();
//		Window win = opt.window();
//
//		Thread.sleep(2000);
//
//		win.minimize();
//		Thread.sleep(2000);
//
//		System.out.println(win.getSize());
//
//		win.fullscreen();
//		System.out.println(win.getSize());

//		position/location

//		Point pt = driver.manage().window().getPosition();
//		System.out.println(pt);
//
//		int X = pt.getX();
//		int Y = pt.getY();
//
//		System.out.println(X + " and " + Y);

		Thread.sleep(3000);
		
		Window win = driver.manage().window();
		
//		set the size of window
		win.setSize(new Dimension(700, 700));
		
//		set the position/location of window
		win.setPosition(new Point(100, 100));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
