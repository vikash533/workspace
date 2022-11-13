package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserInput {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");  
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_P);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_1);
			r.keyPress(KeyEvent.VK_MINUS);
			r.keyPress(KeyEvent.VK_2);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			driver.close();





	}

}
