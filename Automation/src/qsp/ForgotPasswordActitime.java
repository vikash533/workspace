package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordActitime {

	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		boolean forgotPwd = driver.findElement(By.id("toPasswordRecoveryPageLink")).isDisplayed();
		if(forgotPwd==true)
			System.out.println("Test is pass");
		else
			System.out.println("Test is fail");
		driver.close();
		
	}

}
