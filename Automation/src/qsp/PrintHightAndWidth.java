package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHightAndWidth {

	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		int h1 = driver.findElement(By.id("username")).getSize().getHeight();
		int w1 = driver.findElement(By.id("username")).getSize().getWidth();
		int h2 = driver.findElement(By.name("pwd")).getSize().getHeight();
		int w2=driver.findElement(By.name("pwd")).getSize().getWidth();
		System.out.println("Height h1 :"+h1);
		System.out.println("Height h2 :"+h2);
		System.out.println("width w1 :"+w1);
		System.out.println("width w2 :"+w2);
		if(h1==h2 && w1==w2)
			System.out.println("Hight and width of boxes are same and test pass");
		else
		{
			System.out.println("Height and width of boxes are not same and test fail");
		}
		Thread.sleep(500);
		driver.close();
	}

}
