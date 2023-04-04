package com.bw.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bw.base.Base;
import com.bw.pages.HomePages;

public class LoginPage extends Base {
	
	@FindBy(xpath = "//span[@id='ctl00_lblUser']")
	WebElement myAccount;
	
	@FindBy(xpath = "//input[@name='ctl00$phBody$SignIn$txtEmail']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='ctl00$phBody$SignIn$txtPassword']")
	WebElement password;
	
	@FindBy(linkText="Login")
	WebElement loginButton;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	public String verifyLoginPageTitle() {
		return driver.getTitle();
	}
	public HomePages login(String un, String pwd){
		myAccount.click();
		email.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		return new HomePages();
	}
}
