package com.qa.bw.pagetest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bw.base.Base;
import com.bw.pages.HomePages;
import com.bw.pages.LoginPage;
import com.bw.pages.SearchPage;

public class SearchPageTest extends Base{
	SearchPage searchPage;
	HomePages homePage;
	LoginPage loginPage;
	
	public SearchPageTest(){
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		searchPage = new SearchPage();
		homePage = loginPage.login(prop.getProperty("mobile"),prop.getProperty("password"));
		
	}
	@Test(priority=1)
	public void searchBookTest () {
		searchPage.searchByName(prop.getProperty("searchName"));
	}
}
