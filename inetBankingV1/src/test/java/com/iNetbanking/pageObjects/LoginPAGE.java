package com.iNetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPAGE {
	
	WebDriver ldriver;
	
	//Constructor
	
	public LoginPAGE (WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "uid")
	WebElement txtUserName;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(name = "btnLogin")
	WebElement btnlogin;
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit() {
		btnlogin.click();
	}
	
}
