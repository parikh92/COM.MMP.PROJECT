package com.mmp.tests;

import org.testng.annotations.Test;

public class ScheduleAppointment extends BaseTest 
{
	@Test
	public void testScheduleAppointment()
	{
		lp.enterUsername("ria1");
		lp.enterPassword("Ria12345");
		lp.clickLogin();
		sna.ScheduleaAppointment();
		sna.createNewAppointment();
		sna.BookAppointment();
		sna.date();
		sna.textElement();
		sna.submit();
		sna.Table();
		ehp.clickLogout();
	}

}
