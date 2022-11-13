//write the script to print x and y asis login button preset in facebook.
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginLocation {

	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int x1 = driver.findElement(By.name("login")).getLocation().getX();
		int y1 = driver.findElement(By.name("login")).getLocation().getY();

		System.out.println("x-axis of loginbutton :"+x1);
		System.out.println("y-axis of loginbutton :"+y1);
		Thread.sleep(1000);
		driver.close();
	}

}
