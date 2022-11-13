package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutClick1 {

	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//submit() works only if type=submit attribute is present else we will get no suchElementException.
		//driver.findElement(By.id("loginButton")).submit();	
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.close();
		
	
		
		
		
		
	}

}