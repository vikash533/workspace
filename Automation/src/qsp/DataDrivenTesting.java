package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.j2objc.annotations.Property;

public class DataDrivenTesting {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		//get the java representation objct of the physical file.
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		//create an object of property class
		Properties p=new Properties();
		//load all commondata.property file into system.
		p.load(fis);
		String url = p.getProperty("Url");
		String UN = p.getProperty("Username");
		String pw = p.getProperty("Password");
		System.out.println(url);
		System.out.println(UN);
		System.out.println(pw);


	}

}
