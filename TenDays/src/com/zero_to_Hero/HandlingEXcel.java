package com.zero_to_Hero;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandlingEXcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//file inputStream 
		FileInputStream fis=new FileInputStream("./data/testscript1.xlsx");
		//load the file or create a workbook
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("data1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(data);
		
	}

}
