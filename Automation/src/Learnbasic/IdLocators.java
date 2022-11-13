package Learnbasic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocators {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("vikash");
		driver.findElement(By.name("inputPassword")).sendKeys("vikash@20");

		driver.findElement(By.className("signInBtn")).click();

		//System.out.println(driver.findElement(By.className("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("vikash");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("singhvikash532@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("singhvikash533@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String text = driver.findElement(By.xpath("//form/p")).getText();
		System.out.println(text);
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("vikash");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		//Thread.sleep(5000);
		driver.findElement(By.id("chkboxOne")).click();
		//Thread.sleep(5000);
		driver.findElement(By.id("chkboxTwo")).click();
		//Thread.sleep(5000);
		driver.findElement(By.className("signInBtn")).click();
		//Thread.sleep(5000);
		driver.close();


	}

}
