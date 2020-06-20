package com.iNetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage 
{
WebDriver ldriver;
	
	public EditCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[3]/a")
	@CacheLookup
	WebElement lnkEditCustomer;
	
	
	@FindBy(how = How.NAME, using = "cusid")
	@CacheLookup
	WebElement txtCustomerID;

	
	@FindBy(how = How.NAME, using = "AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement btnUpdate;
	
	@FindBy(how = How.XPATH, using ="/html/body/table/tbody/tr/td/table/tbody/tr[14]/td/a")
	@CacheLookup
	WebElement lnkContinue;
	
	public void clickEditCustomer() {
		lnkEditCustomer.click();
	}
	
	public void customerid(String custid) {
		txtCustomerID.sendKeys(custid);
	}
	
	public void custsubmit() {
		btnSubmit.click();
	}
	
	public void customeradd(String custadd) {
		txtAddress.clear();
		txtAddress.sendKeys(custadd);
	}
	
	public void customercity(String custcity) {
		txtCity.clear();
		txtCity.sendKeys(custcity);
	}
	
	public void customerstate(String custstate) {
		txtState.clear();
		txtState.sendKeys(custstate);
	}

	public void custupdate() {
		btnUpdate.click();
	}
	
	public void clickContinue() {
		lnkContinue.click();
	}
}
