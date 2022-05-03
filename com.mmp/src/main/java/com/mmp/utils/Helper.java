package com.mmp.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.mmp.base.DriverScript;

public class Helper extends DriverScript{

	
	public static void fn_Sleep ()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public static String captureScreenshot(WebDriver driver)
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String screenpath = "C:\\Users\\parik\\git\\COM.QA.MMP\\com.mmp\\atreports\\screensshorts";
		 try {
			FileHandler.copy(src, new File(screenpath));
		}
		 catch (IOException e) 
		 {
			
			e.printStackTrace();
		}
		 return screenpath;
	}

}
