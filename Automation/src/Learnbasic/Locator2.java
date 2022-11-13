package Learnbasic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locator2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("vikash");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.tagName("p")).getText();
		System.out.println(text);
		//here we need thread.sleep because there is tag name present in page so why it wait thats the reason we use thread.sleep.
		Thread.sleep(2000);
		boolean k = driver.findElement(By.tagName("p")).isDisplayed();
		if(k==true)
			System.out.println(text+" pass the test cases");
		else
			System.out.println("expected result dosesnot matched");
		Thread.sleep(3000);
		//driver.findElement(By.className("logout-btn")).click();
		//driver.close();
	}

}
