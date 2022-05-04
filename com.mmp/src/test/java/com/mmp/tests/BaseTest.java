package com.mmp.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.mmp.base.DriverScript;
import com.mmp.pages.EnterHomepage;
import com.mmp.pages.LoginPage;
import com.mmp.pages.Messages;
import com.mmp.pages.ScheduleAppointment;

public class BaseTest extends DriverScript {
	LoginPage lp;
	EnterHomepage ehp;
	ScheduleAppointment sna;
	Messages mp;
	
	
	@BeforeMethod
	public void setUp()	{
		
		initApplication();
		lp = new LoginPage();
	    ehp = new EnterHomepage();
	    sna = new ScheduleAppointment();
	    mp = new Messages();
				
	}
	@AfterMethod
	public void tearDown() {
		
		quitDriver();
	}

}
