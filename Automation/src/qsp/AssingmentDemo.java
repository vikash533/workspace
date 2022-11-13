package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[7]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[4]/div/div[1]/div/div")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		}
		driver.quit();
		
		

	}

}
