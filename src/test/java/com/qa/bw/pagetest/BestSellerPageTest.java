package com.qa.bw.pagetest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bw.base.Base;
import com.bw.pages.BestSellersPage;
import com.bw.pages.HomePages;
import com.bw.pages.LoginPage;

public class BestSellerPageTest extends Base {
	BestSellersPage bestSellersPage;
	LoginPage loginPage;
	HomePages homePage;
	
	public BestSellerPageTest () {
		super();
	}
	
	@BeforeMethod
	public void setUp () {
		initialization();
		loginPage = new LoginPage();
		bestSellersPage = new BestSellersPage();
		homePage = loginPage.login(prop.getProperty("mobile"),prop.getProperty("password"));
	}
	@Test(priority=1)
	public void bestSellerLogoTest(){
		boolean message = bestSellersPage.bestSellerLogo();
		Assert.assertTrue(message);
	}
	@Test(priority=2)
	public void buyBookTest() {
		bestSellersPage.bestSeller();
	}
}
