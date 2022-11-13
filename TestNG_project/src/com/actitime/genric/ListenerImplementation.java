package com.actitime.genric;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import test.screenshot;

public class ListenerImplementation extends Baseclass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test start",true);
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	String test=result.getName();
	screenshot t=(screenshot) driver;
	//press the print screen button.
	//File src= t.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/"+test+"ss.png");
	FileUtils.copyFile(src, dest);
	Thread.sleep(3000);
	driver.close();
	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	@Override
	public void openBrowser() {
		
	}

	@Override
	public void closeBroser() {
		
	}

	@Override
	public void login() {
		
	}

	@Override
	public void logout() {
		
	}

}
