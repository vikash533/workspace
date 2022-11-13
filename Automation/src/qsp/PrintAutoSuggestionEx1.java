//Automate the following Scenerio.
//open the chrome browser go to google.com
//Type qspider in search textbox.
//capture all the autosuggestion and print the text.
//select the last auto suggestion.

package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestionEx1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter the url");
		Scanner sc=new Scanner(System.in);
		String url = sc.nextLine();
		WebDriver driver =new ChromeDriver();
		//Go to google.
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys("qspider");
		Thread.sleep(3000);
		//find all the suggestion and print the count.
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'qspider')]"));
		int count=allsugg.size();
		System.out.println(count);
		//print the text of all autosuggestion.
		for(int i=0;i<count;i++)
		{
			String text = allsugg.get(i).getText();
			System.out.println(text);
		}
		allsugg.get(count-1).click();
		driver.close();
		
		
	}

}
