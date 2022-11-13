package com.zero_to_Hero;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion1 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> allsug = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allsug.size();
		System.out.println(count);
		for (WebElement suges : allsug) {
			String text = suges.getText();
			System.out.println(text);

		}
		Thread.sleep(3000);
		driver.close();


	}

}
