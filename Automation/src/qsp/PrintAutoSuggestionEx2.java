//Automate the following Senerio.
//Go to flipkart.com
//Type iphone in search box.
//campare all the auto sujjestion and print the text.
//select the last autoSuggestion.
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestionEx2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(3000);
		//find all the suggestion and print the count.
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		
	}

}
