package com.mmp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmp.base.DriverScript;

public class EnterHomepage extends DriverScript {
	//-------------------------------------- PAGE ELEMENTS-----------------------------------------//
	
	@FindBy(xpath = "/html/body/div[1]/nav/div[2]/ul/li/a/span") WebElement textUserLoggedElement;
	@FindBy(xpath = "//span[text()='  Logout ']") WebElement linkLogoutElement;
	
	//----------------------------------------PAGE INITIALIZATION-------------------------------//
	
		public EnterHomepage()
		{
			PageFactory.initElements(driver, this);
		}
		
		//----------------------------------------PAGE METHOD-------------------------------------//
		
		public void clickLogout()
		{
			linkLogoutElement.click();
		}
		
		public String verfyuserLogged()
		{
			return textUserLoggedElement.getText();
		}

}
