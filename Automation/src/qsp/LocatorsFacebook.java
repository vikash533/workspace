package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		//enter the user name email
		driver.findElement(By.id("email")).sendKeys("singhvikash533@gmail.com");
		//enter the user name password
		driver.findElement(By.xpath("//div[@id='passContainer']")).sendKeys("#vikash@20");
		driver.close();
		
		
	}

}
