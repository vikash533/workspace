package com.zero_to_Hero;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	static {
		System.setProperty("webdriver.chorme.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		List<WebElement> autosug = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		int count = autosug.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = autosug.get(i).getText();
			System.out.println(text);
			}
		driver.close();

	}

}
