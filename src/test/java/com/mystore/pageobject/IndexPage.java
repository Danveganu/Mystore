package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
//1. Create object of webDriver
	
	   WebDriver ldriver;
	
	public IndexPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Identify webelements
	@FindBy(linkText="Sign in")
    WebElement signin;
	
	
	// methods for performing action on WebElements
	
	public void clickOnSignIn() {
		signin.click();
	}
	
}
