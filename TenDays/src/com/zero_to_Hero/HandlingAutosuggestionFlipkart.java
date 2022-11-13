package com.zero_to_Hero;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutosuggestionFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[text()='✕']")).click();
driver.findElement(By.name("q")).sendKeys("iphone");
List<WebElement> allsug = driver.findElements(By.tagName("li"));
int count = allsug.size();
System.out.println(count);
for (WebElement option : allsug) {
	String text = option.getText();
	System.out.println(text);
}
driver.close();

	}

}
