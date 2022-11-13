package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.actitime.genric.BaseClass;
import com.actitime.genric.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

import dev.failsafe.internal.util.Assert;
@Listeners(com.actitime.genric.ListernerImplemntation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException  {
		Reporter.log("CreateCustomer",true);
		FileLib f=new FileLib();
		String expCustName = f.getExcelData("CreateCustomer", 1, 2);
		String custDesp = f.getExcelData("CreateCustomer", 1, 3);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.AddnewBtn.click();
		t.getNewCustOption().click();
		t.getEnterCustTbx().sendKeys(expCustName);
		t.getEnterCustDesp().sendKeys(custDesp);
		t.getSelectCustDD().click();
		t.getOurCompanyTx().click();
		t.getCreateCustBtn().click();
		Thread.sleep(4000);
		String actualCustName = t.getActualCustCreateTx().getText();
		Assert.assertEquals(actualCustName, expCustName);

}
}
