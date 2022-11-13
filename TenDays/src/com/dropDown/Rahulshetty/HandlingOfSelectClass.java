package com.dropDown.Rahulshetty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingOfSelectClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdwon = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticdropdwon);
		dropdown.selectByIndex(3);
		String text = dropdown.getFirstSelectedOption().getText();
		System.out.println(text);
		dropdown.selectByVisibleText("AED");
		String text1 = dropdown.getFirstSelectedOption().getText();
		System.out.println(text1);
		dropdown.selectByValue("INR");
		String text2 = dropdown.getFirstSelectedOption().getText();
		System.out.println(text2);
		driver.close();
	
		
		

	}

}
