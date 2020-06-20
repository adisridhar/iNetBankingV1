package com.iNetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Creating Driver Object
	WebDriver lDriver;
	
	// Creating Constructor initiate the Driver and web elements with PageFactory 
	public LoginPage(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this); //
	}

	// identify then web elements
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a") // logout link after login
	@CacheLookup
	WebElement lnkLogout;
	
	
	// Create action methods for web elements
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
		
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickLogout() // method for logout after login
	{
		lnkLogout.click();
	}

}
