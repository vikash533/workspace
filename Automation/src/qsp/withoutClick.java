package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutClick {

	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		Thread.sleep(5000);
		driver.findElement(By.id("user_login_btn")).submit();
		driver.close();
	}

}
