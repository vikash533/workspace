package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.genric.Baseclass;

public class CustomerModule extends Baseclass {
	@Test
	 public void createCustomer() {
		 Reporter.log("createCustomer",true);
	 }
	@Test
	public void deleteCustomer(){
		Reporter.log("deleteCustomer",true);
	}
	@Test
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}

}
