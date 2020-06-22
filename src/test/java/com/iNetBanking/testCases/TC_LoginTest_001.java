package com.iNetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException, InterruptedException {

		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		Thread.sleep(3000);
		
		lp.clickSubmit();
				
		if(driver.getTitle().equals(" Guru99 Bank Manager HomePage "))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			//method from the base class to capture screenshot
			captureScreen(driver,"loginTest");
			
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
	
}
