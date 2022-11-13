package com.actitime.genric;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class DemoScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String [] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		TakesScreenshot t=(TakesScreenshot) driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/ss.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(3000);
		driver.close();
		
	}

}
