package com.mmp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mmp.base.DriverScript;
import com.mmp.utils.Helper;

public class ScheduleAppointment extends DriverScript {
	
	//-------------------------------------- PAGE ELEMENTS-----------------------------------------//
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/ul/li[4]/a/span") WebElement SchedulAppointmentElement;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[3]/a/input") WebElement createNewAppointmentElement;
	@FindBy(xpath = "//h4[normalize-space()='Dr.Charlie']/ancestor::ul/following::button") WebElement bookAppointmentElement;
	@FindBy(xpath = "//input[@id='datepicker']") WebElement textboxDatElement;
	@FindBy(xpath = "//*[@id=\"ChangeHeatName\"]")WebElement continuElement;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/form/textarea") WebElement textElement;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[3]/input") WebElement buttonSubmitElement;
	//@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/table") WebElement tableElement;
	
	//----------------------------------------PAGE INITIALIZATION-------------------------------//
	
		public ScheduleAppointment ()
		{
			PageFactory.initElements(driver, this);
		}
		
		//----------------------------------------PAGE METHOD-------------------------------------//
		
		public void ScheduleaAppointment()
		{
			SchedulAppointmentElement.click();
			Helper.fn_Sleep();
		}
		
		public void createNewAppointment()
		{
			createNewAppointmentElement.click();
			Helper.fn_Sleep();
		}
		
		public void BookAppointment()
		{
			bookAppointmentElement.click();
			
		}
		
		public void date()
		{
			String month = "May";
			String year = "2022";
			String day = "20";
			driver.switchTo().frame("myframe");
			textboxDatElement.click();
			
			while(true)
			{
				String text = driver.findElement(By.xpath("/html/body/div[2]/div/div/span[1]")).getText();
				
				if(text.equals(month ))
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("/html/body/div[2]/div/a[2]/span")).click();
				}
				
				String text1 = driver. findElement(By.xpath("/html/body/div[2]/div/div/span[2]")).getText();
				
				if(text1.equals(year))
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("/html/body/div[2]/div/a[2]/span")).click();
				}
				
				}
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td/a[contains(text(),"+day+")]")).click();
			
			Select dropValue = new Select(driver.findElement(By.xpath("//select[@id='time']")));
			dropValue.selectByVisibleText("11Am");
			continuElement.click();
			Helper.fn_Sleep();
		}
		
		public void textElement()
		{
			textElement.sendKeys("cold");
		}
		
		public void submit()
		{
			buttonSubmitElement.click();
		}
		
		public void Table()
		{
			String columnFirst ="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/table/tbody/tr[0";
			String columnLast = "]/td";
			String column;
			List<WebElement> appoinmentColumn;
			
			for(int i=0; i<=1; i++)
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