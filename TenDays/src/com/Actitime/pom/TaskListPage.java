package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement ADDnewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement AddNewCust;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement EnterCustName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement EnterCustDescrip;
	
	@FindBy(xpath="//div[text()='- Select Customer -']")
	private WebElement SelctCustDw;
	
	@FindBy(xpath="//div[text()='Our company' and @class=\"text\"]")
	private WebElement SelectOurcomp;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement CreateCust;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getADDnewBtn() {
		return ADDnewBtn;
	}



	public WebElement getAddNewCust() {
		return AddNewCust;
	}

	
	public WebElement getEnterCustName() {
		return EnterCustName;
	}


	public WebElement getEnterCustDescrip() {
		return EnterCustDescrip;
	}

	

	public WebElement getSelctCustDw() {
		return SelctCustDw;
	}

	
	public WebElement getSelectOurcomp() {
		return SelectOurcomp;
	}



	public WebElement getCreateCust() {
		return CreateCust;
	}

	
	
	

}
