package com.zero_to_Hero;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimePropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com");
		FileInputStream fis=new FileInputStream("./data/commondata1.property");
		Properties p=new Properties();
		p.load(fis);
		String UN = p.getProperty("un");
		String PW = p.getProperty("pw");
		System.out.println(UN);
		System.out.println(PW);
		driver.findElement(By.id("username")).sendKeys(UN);
		driver.findElement(By.name("pwd")).sendKeys(PW);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(8000);
		driver.close();


	}

}
