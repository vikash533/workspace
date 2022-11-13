//Write a Script to scroll to top to bottom and vice-versa in bbc.com
package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar4 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.bbc.com/");
JavascriptExecutor j=(JavascriptExecutor) driver;
j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
Thread.sleep(5000);
j.executeScript("window.scrollTo(0,0)");

	}

}
