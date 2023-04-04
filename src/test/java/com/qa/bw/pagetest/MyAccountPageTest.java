package com.qa.bw.pagetest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bw.base.Base;
import com.bw.pages.HomePages;
import com.bw.pages.LoginPage;
import com.bw.pages.MyAccountPage;

public class MyAccountPageTest extends  Base {
	MyAccountPage myAccountPage;
	LoginPage loginPage;
	HomePages homePage;
	
	public MyAccountPageTest () {
		super();
	}
	@BeforeMethod
	public void setUp () {
		initialization();
		loginPage = new LoginPage();
		myAccountPage = new MyAccountPage();
		homePage = loginPage.login(prop.getProperty("mobile"),prop.getProperty("password"));
	}
	@Test(priority=1)
	public void myAccountTitleTest(){
		String myaccountTitle = myAccountPage.MyAccountTitle();
		Assert.assertEquals(myaccountTitle, "Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
	}
	@Test(priority=2)
	public void myAccountLogoTest(){
		boolean message =  myAccountPage.logoIsDisplayed();
		Assert.assertTrue(message);
	}
	
	@Test(priority=3)
	public void addAddress_MyAccount_Test () {
		myAccountPage.addNewAddress(prop.getProperty("FullName"),prop.getProperty("StreetAddress"),prop.getProperty("mobile"),prop.getProperty("PinCode"));
	}
}
