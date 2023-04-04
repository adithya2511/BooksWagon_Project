package com.bw.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bw.base.Base;

public class SignUpPage extends Base {
	
	@FindBy(xpath = "//img[@class='logonew']")
	WebElement booksWagonLogo;
	
	@FindBy(xpath = "//span[@id='ctl00_lblUser']")
	WebElement myAccount;
	
	@FindBy(linkText = "New to Bookswagon? Sign up")
	WebElement signUp;
	
	@FindBy(xpath ="//input[@name='ctl00$phBody$SignUp$txtName']")
	WebElement name;
	
	@FindBy(xpath ="//input[@name='ctl00$phBody$SignUp$txtEmail']")
	WebElement mobileNumber;
	
	@FindBy(xpath ="//div[@data-sitekey='6LcWegclAAAAANuIZ3_JgCoh-naBjY69vaCvY2Xj']")
	WebElement captcha;
	
	@FindBy(xpath ="//input[@name='ctl00$phBody$SignUp$btnContinue']")
	WebElement continueButton;

	
	

	public SignUpPage(){
		PageFactory.initElements(driver, this);
	}

	public  boolean logoIsDisplayed(String uname,String mbNumber){
		boolean logo = booksWagonLogo.isDisplayed();
		booksWagonLogo.click();
		myAccount.click();
		signUp.click();
		name.sendKeys(uname);
		mobileNumber.sendKeys(mbNumber);
		captcha.click();
		continueButton.click();
		return logo;
	}
}
