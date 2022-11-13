package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day3 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("before executing any method in the class");
	}
	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println("before every method it execute");
	}

	@Test(groups={"regressionTest","smokeTest"})
	public void WebloginCarLoan() 
	{
		//selenium
		System.out.println("WebLoginCar");

	}

	@Test(groups={"regressionTest","smokeTest"})
	public void MobileLoginCarLoan()
	{
		//appium 
		System.out.println("Mobilelogin car");
	}
	@Test
	public void LoginAPIcarLoan()
	{
		//Rest Api login
		System.out.println("login Api carloan");
	}

	@AfterMethod
	public void afterEvery()
	{
		System.out.println("after every method it execute");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after executing any method in the class");
	}
}
