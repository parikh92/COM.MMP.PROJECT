package com.mmp.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
	@FindBy(xpath = "/html/body/div/section/div/div/div/form/p[1]/input") WebElement AdminUserElement;
	@FindBy(xpath = "/html/body/div/section/div/div/div/form/p[2]/input") WebElement AdminPasswordElement;
	@FindBy(xpath = "/html/body/div/section/div/div/div/form/p[6]/input") WebElement SigninElement;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div/ul/li[7]/a/span") WebElement AdminmessagesbuttonElement;
	
	
	
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
	
	public void admin()
	{
		String username = "Ben@123";
		String password = "Frank@123";
		
		driver.get("http://96.84.175.78/MMP-Release2-Admin-Build.2.1.000/login.php");
		AdminUserElement.sendKeys(username);
		AdminPasswordElement.sendKeys(password);
		SigninElement.click();
		AdminmessagesbuttonElement.click();

		String columnFirst ="/html/body/div/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[0";
		String columnLast = "]/td";
		String column;
		List<WebElement> appoinmentColumn;
		
		for(int i=2; i<=3; i++)
		{
			column = columnFirst+i+columnLast;
			
			appoinmentColumn = driver.findElements(By.xpath(column));
			
			for (int j=0;j<appoinmentColumn.size();j++)
			{
				System.out.println(appoinmentColumn.get(j).getText()+"  ");
			}
			System.out.println();
			}
		
		}
	
}
