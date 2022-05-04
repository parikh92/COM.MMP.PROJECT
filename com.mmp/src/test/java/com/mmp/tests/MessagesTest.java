package com.mmp.tests;

import org.testng.annotations.Test;

public class MessagesTest extends BaseTest {
	
	@Test
	public void messagestest()
	
	{
		lp.enterUsername("ria1");
		lp.enterPassword("Ria12345");
		lp.clickLogin();
		mp.Messagesbutton();
		mp.Contact("Monthly Visit");
		mp.Subject("To meet doctor follow-up");
		mp.Send();
		ehp.clickLogout();
	}
	
}
