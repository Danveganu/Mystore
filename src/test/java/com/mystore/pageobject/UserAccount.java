package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccount {

	//1. Create object of webDriver

	WebDriver ldriver;
    public UserAccount(WebDriver rdriver)
    {
        ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Find Elements on page
	@FindBy(xpath="//a[@title='View my customer account']")
	WebElement Username;

	public String userName() {
		String str= Username.getText();
		return str;
	}


}
