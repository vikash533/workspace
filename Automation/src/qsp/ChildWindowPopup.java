//Write a Script to the window handel of all the brower after clicking facebook and appel present in indeed.
package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();
		for (String wh : allwh) {
			System.out.println(wh);
			
		}
		//driver.close(); FOR CURRENT BROWER CLOSE WE USE CLOSE.
		//FOR CLOSE ALL TAB PRESENT AT BROSER WE USE QUIT().
		driver.quit();
		
	}

}
