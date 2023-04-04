package com.bw.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bw.base.Base;

public class MyAccountPage extends Base{
	
	@FindBy(linkText = "My Address")
	WebElement myAddressButton;
	
	@FindBy(linkText = "Add Address")
	WebElement addAddressButton;
	
	@FindBy(xpath = "//input[@id='ctl00_phBody_ShippingAddress_txtRecipientName']")
	WebElement fullName;
	
	@FindBy(xpath = "//input[@id='ctl00_phBody_ShippingAddress_txtAddress']")
	WebElement streetAddress;
	
	@FindBy(xpath = "//input[@id='ctl00_phBody_ShippingAddress_txtPincode']")
	WebElement pincode;
	
	@FindBy(xpath = "//input[@id='ctl00_phBody_ShippingAddress_txtMobile']")
	WebElement mobile;
	
	@FindBy(xpath = "//option[@value='Telangana']")
	WebElement selectState;
	
	@FindBy(xpath = "//option[@value='Hyderabad']")
	WebElement selectCity;
	
	@FindBy(linkText = "Update")
	WebElement upDateButton;
	
	@FindBy(xpath ="//img[@class='logonew']")
	WebElement MyAccountTitle;
	
	public MyAccountPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void addNewAddress (String fName,String StreetAdd, String pin, String mob ) {
		myAddressButton.click();
		addAddressButton.click();
		fullName.sendKeys(fName);
		streetAddress.sendKeys(StreetAdd);
		selectState.click();
		selectCity.click();
		pincode.sendKeys(pin);
		mobile.sendKeys(mob);
		upDateButton.click();
	}
	public String MyAccountTitle () {
	 return driver.getTitle();
	}
	public boolean logoIsDisplayed () {
		boolean logo = MyAccountTitle.isDisplayed();
		return logo;
	}
}
