package com.actiTime.genric;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileLIbrary {

	public String getPropertyData(String key) throws IOException {
FileInputStream fis=new FileInputStream("./data/commondata.property");
Properties p=new Properties();
p.load(fis);
String data = p.getProperty(key);
return data;
	}

	public void setExcelData(String string) {
		
	}

}
