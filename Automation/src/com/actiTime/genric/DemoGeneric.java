package com.actiTime.genric;

import java.io.IOException;

public class DemoGeneric {

	public static void main(String[] args) throws IOException {
		FileLIbrary f=new FileLIbrary();
		//to read the data from property file.
		 System.out.println(f.getPropertyData("Url"));
		
		//to write the data to excel file.
		//f.setExcelData("CreateCustomer",)
	}

}
