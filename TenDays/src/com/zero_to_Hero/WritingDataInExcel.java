package com.zero_to_Hero;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis =new FileInputStream("./data/testscript1.xlsx");
Workbook wb = WorkbookFactory.create(fis);
wb.getSheet("data1").getRow(1).getCell(2).setCellValue("pass");
FileOutputStream fos=new FileOutputStream("./data/testscript1.xlsx");
wb.write(fos);
//System.out.println(fos);
wb.close();
	}

}
  