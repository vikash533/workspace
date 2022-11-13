package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RightClick {
	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		//driver.findElement(By.id("")).sendKeys(args)
		
	}

}
