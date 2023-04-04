package com.bw.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bw.base.Base;

public class SearchPage extends Base {
	
	@FindBy(xpath = "//input[@id='inputbar']")
	WebElement textBox;
	
	@FindBy(xpath = "//input[@name='btnTopSearch']")
	WebElement searchButton;
	
	@FindBy(xpath = "//img[@alt='Rich Dad Poor Dad']")
	WebElement book;
	
	@FindBy(xpath = "//input[@value='Add to Wishlist']")
	WebElement addToWishList;
	
	
	public SearchPage(){
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	public void searchByName (String name) {
		textBox.sendKeys(name);
		searchButton.click();
		book.click();
		addToWishList.click();
	}
}
