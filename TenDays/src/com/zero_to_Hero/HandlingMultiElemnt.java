package com.zero_to_Hero;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiElemnt {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		int count = alllink.size();
		System.out.println(count);
		/*for (int i = 0; i < count; i++) {
			String text = alllink.get(i).getText();
			System.out.println(text);
		}*/
		for (WebElement options : alllink) {
			String text = options.getText();
			System.out.println(text);
			
		}
		Thread.sleep(5000);
		driver.close();

	}

}
