package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxActitime {

	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		boolean checkbox = driver.findElement(By.id("keepLoggedInCheckBox")).isDisplayed();
		if(checkbox==true)
			System.out.println("checkbox is present and test is pass");
		else
			System.out.println("checkbos is absent and test is fail");
		driver.close();
	
	}

}