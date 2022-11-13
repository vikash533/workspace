 package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test(groups="regression Test")
	public void plan() {
		System.out.println("good");
	}
	@BeforeTest
	public void prerequist()
	{
		System.out.println("It will execute first");
	}
	@AfterTest
	public void lastrequist()
	{
		System.out.println("it will execute last");
	}
}
