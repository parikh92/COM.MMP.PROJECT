package com.mmp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmp.base.DriverScript;

public class LoginPage extends DriverScript {
	//-------------------------------------- PAGE ELEMENTS-----------------------------------------//
	@FindBy(xpath = "//input[@id='username']") WebElement textboxUsernamElement;
	@FindBy(xpath = "//input[@id='password']") WebElement textboxPasswordElement;
	@FindBy(xpath = "//input[@name='submit']") WebElement buttonLoginElement;
	@FindBy(xpath = "//a[text()='forgot Username / Password']") WebElement linkForgotPasswordElement;
	
	
	
	//----------------------------------------PAGE INITIALIZATION-------------------------------//
	
	public LoginPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------------------------------------PAGE METHOD-------------------------------------//
	
	public boolean verifylinkForgotPassword()
	{
		return linkForgotPasswordElement.isDisplayed();
	}
	
	
	public void enterUsername(String username)
	{
		textboxUsernamElement.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		textboxPasswordElement.sendKeys(password);
	}
	
	public void clickLogin()
	{
		buttonLoginElement.click();
	}

}
