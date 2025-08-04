package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	//1. Create object of webDriver

	WebDriver ldriver;
	public MyAccount(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Identify WebElements

	@FindBy(id="email_create")
	WebElement createEmail;
	@FindBy(id="SubmitCreate")
	WebElement SubmitCreate;


	// methods for performing action on WebElements

	public void enterCreateemailAdress(String emailAdd) 
	{
		createEmail.sendKeys(emailAdd);
	}
	public void submitCreate() 
	{
		SubmitCreate.click();
	}

}
