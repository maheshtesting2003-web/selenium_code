package working_with_wd;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		method Chaining
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(1500);

		Options opt = driver.manage();
		Window win = opt.window();

		win.minimize();
		Thread.sleep(1500);

		win.fullscreen();
		Thread.sleep(1500);

//		get the size of window
		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim);
		int w = dim.getWidth();
		int h = dim.getHeight();

		System.out.println("width is : " + w);
		System.out.println("height is : " + h);

//		set the size of window
		win.setSize(new Dimension(700, 700));

//		get the location/position of window
		Point pt = win.getPosition();
		System.out.println(pt);

		int x = pt.getX();
		int y = pt.getY();

		System.out.println("x : " + x);
		System.out.println("y : " + y);

//		set the position of window 
		win.setPosition(new Point(500, 500));

		Thread.sleep(4000);

		driver.quit();
	}
}
