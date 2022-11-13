package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement AddnewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement AddnewCust;
	
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement EnterNewcust;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement EntercustDes;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDD;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow selected']")
	private WebElement ourCompanyTx;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustCreateTx;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewBtn() {
		return AddnewBtn;
	}

	public WebElement getAddnewCust() {
		return AddnewCust;
	}

	public WebElement getEnterNewcust() {
		return EnterNewcust;
	}

	public WebElement getEntercustDes() {
		return EntercustDes;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getOurCompanyTx() {
		return ourCompanyTx;
	}
	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}
	public WebElement getActualCustCreateTx() {
		return actualCustCreateTx;
	}

}
