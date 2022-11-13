//Automate the following Scenerio .
//open the brower go to google.com.
//Type java in search textbox.
//find all the autosuggestion.
//print the count of autosuggestion.
//select the first auto suggestion.

package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestion {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		// Go to Google
		driver.get("https://www.google.com/");
		//Type java in searchbox.
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		//find all the suggestion and print the count.
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=allsugg.size();
		System.out.println(count);
		//print the text of all autosuggestion.
		for(int i=0;i<count;i++)
		{
			String text = allsugg.get(i).getText();
			System.out.println(text);
		}
		allsugg.get(0).click();
		driver.close();
	}

}
