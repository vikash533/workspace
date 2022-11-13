package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacbookLoginButton {

	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		boolean button = driver.findElement(By.xpath("//button[@name='login']")).isDisplayed();
		if(button==true)
			System.out.println("Login button is present and pass");
		else
			System.out.println("login button is not present and fail");
		driver.close();
	
	}

}
