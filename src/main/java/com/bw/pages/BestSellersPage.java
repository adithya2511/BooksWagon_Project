package com.bw.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bw.base.Base;

public class BestSellersPage extends Base {

	@FindBy (linkText = "Best sellers")
	WebElement bestSellerButton;
	
	@FindBy (xpath = "//span[@id='ctl00_phBody_lblHeading']")
	WebElement bestSellerTitle;
	
	@FindBy (xpath = "//img[@alt='It Ends with Us']")
	WebElement book;
	
	@FindBy (xpath = "//input[@value='Add to Wishlist']")
	WebElement addToWishListButton;
	
	@FindBy (xpath = "//input[@value='Buy Now']")
	WebElement buyNowButton;

	
	@FindBy (xpath = "//input[@value='Place Order']")
	WebElement placeOrderButton;
	
	@FindBy (linkText = "Move to Wishlist")
	WebElement moveToWishListButton;
	
	@FindBy (xpath = "//iframe[@class ='cboxIframe']")
	WebElement frame;
	
	@FindBy (xpath = "//input[@value ='Deliver to this Address']")
	WebElement addressButton;
	
	@FindBy (xpath = "//input[@value ='Save & Continue']")
	WebElement continueButton;
	
	
	
	
	public BestSellersPage () {
		PageFactory.initElements(driver, this);
	}
	public boolean bestSellerLogo () {
		bestSellerButton.click();
		boolean logo = bestSellerTitle.isDisplayed();
		return logo;
		
	}
	public void bestSeller() {
		bestSellerButton.click();
		book.click();
		buyNowButton.click();
		driver.switchTo().frame(frame);
		placeOrderButton.click();
		driver.switchTo().defaultContent();
		addressButton.click();
		continueButton.click();
		
	}
}
