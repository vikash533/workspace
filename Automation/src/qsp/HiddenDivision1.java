package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivision1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("1234");
		driver.findElement(By.cssSelector("input#dob")).click();
		WebElement mon = driver.findElement(By.className("ui-datepicker-month"));
		Select s=new Select(mon);
		s.selectByValue("10");
		WebElement year = driver.findElement(By.cssSelector("select.ui-datepicker-year"));
		Select s1=new Select(year);
		s1.selectByValue("2020");
		driver.findElement(By.linkText("27")).click();
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean k = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(k==true)
			System.out.println("test is pass");
		else
			System.out.println("Test is fail");
		driver.close();
			
		
	}

}
