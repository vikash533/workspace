package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		//url
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		//username
		driver.findElement(By.id("email")).sendKeys("singhvikash533@gmail.com");
		//password
		driver.findElement(By.id("password")).sendKeys("#Vikash@201");
		//click login
		driver.findElement(By.name("commit")).click();
		//give msg
		System.out.println(driver.findElement(By.cssSelector("div.bodySmall")).getText());
		//click on forgot password
		driver.findElement(By.linkText("Forgot Password")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vikash");
		

		
		
	}

}
