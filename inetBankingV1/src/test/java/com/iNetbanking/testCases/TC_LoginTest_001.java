package com.iNetbanking.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetbanking.pageObjects.LoginPAGE;


public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() {
	
		logger.info("URL is opened");
		
		LoginPAGE lp = new LoginPAGE(driver);
		lp.setUserName(userName);
		logger.info("username entered");
		lp.setPassword(password);
		//System.out.println(userName);
		//System.out.println(password);
		logger.info("password entered");
		lp.clickSubmit();
		logger.info("clicked on submit button");
		if (driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("login test passed");
		}else {
			Assert.assertTrue(false);
			logger.info("login test failed");
		}
	}

}
