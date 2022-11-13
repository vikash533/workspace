package com.zero_to_Hero;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {
FileInputStream fis=new FileInputStream("./data/commondata1.property");
Properties p=new Properties();
p.load(fis);
String URL = p.getProperty("url");
String UN = p.getProperty("un");
String PW = p.getProperty("pw");
System.out.println(URL);
System.out.println(UN);
System.out.println(PW);


	}

}
