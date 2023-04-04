package com.qa.bw.pagetest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bw.base.Base;
import com.bw.pages.HomePages;
import com.bw.pages.LoginPage;

public class LoginPageTest extends Base {
	LoginPage loginPage;
	HomePages homePages;

	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String loginPageTitle = loginPage.verifyLoginPageTitle();
		Assert.assertEquals(loginPageTitle, "Online Bookstore | Buy Books Online | Read Books Online","LoginPageTitle not match");
	}
	
	@Test(priority=2)
	public void LoginTest () {
		loginPage.login(prop.getProperty("mobile"),prop.getProperty("password"));
	}
}
