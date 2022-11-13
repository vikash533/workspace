package com.actitime.genric;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getProperty(String key) throws IOException
	{
		//get the java representative object of the physical file
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		//create an object of property file class
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		//get the java representative object of the physical file
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		//create workbook or open the excel in read mode.
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of the sheet, then row,then sheet and read the data.
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public void setExcelData(String sheetName,int row,int cell,String value) throws EncryptedDocumentException, IOException
	{
		//get the java representative object of the physical file
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		//create workbook or open the excel in read mode.
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of the sheet, then row,then sheet and read the data.
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		wb.close();

	}

}
