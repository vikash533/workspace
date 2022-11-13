//write a script to print the color of forgot the passward link present in facebook.
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColor {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String colour = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
		System.out.println(colour);
		Thread.sleep(500);
		driver.close();
	}

}
