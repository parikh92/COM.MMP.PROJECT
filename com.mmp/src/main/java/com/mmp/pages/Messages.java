package com.mmp.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmp.base.DriverScript;
import com.mmp.utils.Helper;

public class Messages extends DriverScript {
	
	//-------------------------------------- PAGE ELEMENTS-----------------------------------------//
	@FindBy(xpath = "//span[normalize-space()='Messages']") WebElement MessagesbuttonElement;
	@FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div/form/div/table/tbody/tr[2]/td/input") WebElement ContactElement;
	@FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div/form/div/table/tbody/tr[3]/td/textarea") WebElement SubjectElement;
	@FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div/form/div/table/tbody/tr[4]/td/input") WebElement SendElement;
	
	
	//----------------------------------------PAGE INITIALIZATION---------------------------------//
	
	public Messages()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//----------------------------------------PAGE METHOD----------------------------------------//
	
	public void Messagesbutton()
	{
		MessagesbuttonElement.click();
	}
	
	public void Contact(String Reason)
	{
		ContactElement.sendKeys(Reason);
		Helper.fn_Sleep();
	}
	
	public void Subject(String Subject)
	{
		SubjectElement.sendKeys(Subject);
	}
	
	public void Send()
	{
		SendElement.click();
		Helper.fn_Sleep();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	
}
