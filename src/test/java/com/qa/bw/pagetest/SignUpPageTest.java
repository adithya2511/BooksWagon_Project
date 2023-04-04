package com.qa.bw.pagetest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bw.base.Base;
import com.bw.pages.SignUpPage;

public class SignUpPageTest extends Base{
	SignUpPage signUpPage;
	
	public SignUpPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		signUpPage = new SignUpPage();	
	}
	
	@Test(priority=1)
	public void SignUpTest() {
	boolean messeage = signUpPage.logoIsDisplayed(prop.getProperty("username"),prop.getProperty("mobile"));
	Assert.assertTrue(messeage);
	}
}
