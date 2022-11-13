package qsp;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllbrowerExceptSpecific {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the title of brower");
		String etitle=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) {
			Thread.sleep(2000);
			driver.switchTo().window(wh);
			String atitle = driver.getTitle();
			System.out.println(atitle);
			if(atitle.equals(etitle))
			{
				driver.close();
			}
			
		}

			
	}

}
