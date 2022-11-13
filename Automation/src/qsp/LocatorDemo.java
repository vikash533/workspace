package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		//class name
		int count = driver.findElements(By.className("homeslider-container")).size();
		System.out.println(count);
		//tag name
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);
	
		
		
	}

}
