package com.iNetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.iNetBanking.pageObjects.EditCustomerPage;
import com.iNetBanking.pageObjects.LoginPage;

public class TC_EditCustomerTest_004 extends BaseClass
{
	@Test
	public void editCustomer() throws InterruptedException 
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		EditCustomerPage editcust = new EditCustomerPage(driver);
		editcust.clickEditCustomer();
		logger.info("providing customer edit....");
		editcust.customerid("38562");
		editcust.custsubmit();
		Thread.sleep(3000);
		
		editcust.customeradd("Hyderabad");
		editcust.customercity("Hyderabad");
		editcust.customerstate("Telangana");
		editcust.custupdate();
		Thread.sleep(3000);
		
		
		if(isAlertPresent()==true) // checking alert message
		{
			Assert.assertTrue(false);
			logger.info("Update failed"); // warning message for Login failed
			driver.switchTo().alert().accept(); //close alert
			//driver.switchTo().defaultContent(); // switch to default web page mean login page
			Thread.sleep(3000);
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Update passed");
			Thread.sleep(3000);
			editcust.clickContinue();
		}
		
		
	}
}
