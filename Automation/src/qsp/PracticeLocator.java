package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocator {

	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		
		//id and name locators.
		WebElement search = driver.findElement(By.id("search_query_top"));
		search.sendKeys("T-shirt");
		driver.findElement(By.name("submit_search")).click();
		
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		
		
		
	}

}
