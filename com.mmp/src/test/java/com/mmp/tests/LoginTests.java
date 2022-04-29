package com.mmp.tests;

import org.testng.annotations.Test;

import com.mmp.utils.Helper;

public class LoginTests extends BaseTest {
	
	
	@Test(priority = 1)
	public void testLogin() {
		lp.enterUsername("ria1");
		lp.enterPassword("Ria12345");
		lp.clickLogin();
		String actual = ehp.verfyuserLogged();
		System.out.println(actual);
		ehp.clickLogout();
		Helper.fn_Sleep();
	}
	@Test(priority = 2)
	public void testValidatePasswordLink() 
	{
		boolean flag = lp.verifylinkForgotPassword();
		System.out.println(flag);
		Helper.fn_Sleep();
	
	}

}
