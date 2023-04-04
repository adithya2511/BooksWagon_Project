package com.bw.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bw.base.Base;

public class HomePages extends Base {
	
	@FindBy(xpath = "//span[@id='ctl00_lblUser']")
	WebElement myAccount;
	
	@FindBy (linkText = "Best sellers")
	WebElement bestSellerButton;

	public HomePages(){
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	public MyAccountPage clickOnMyAccount () {
		myAccount.click();
		return new MyAccountPage();
	}
	public BestSellersPage clickOnBestSeller() {
		bestSellerButton.click();
		return new BestSellersPage();
	}
}
