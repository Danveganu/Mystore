package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {
	//1. Create object of webDriver
	
			WebDriver Ldriver;
			
			public AccountCreation(WebDriver rdriver) {
				
				Ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
			}
			
			//Identify webelements
			@FindBy(id="id_gender1")
		    WebElement Selectgender;
			@FindBy(id="customer_firstname")
		    WebElement customer_firstname;
			@FindBy(id="customer_lastname")
		    WebElement customer_lastname;
			@FindBy(id="passwd")
		    WebElement password;
			@FindBy(id="submitAccount")
		    WebElement Registerbutton;
			//@FindBy(linkText="Add my first address")
			@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div/ul/li[1]/a/span")
			WebElement Add_myFirst_Adress;
			@FindBy(id="address1")
			WebElement Adress;
			@FindBy(id="city")
			WebElement city;
			@FindBy(id="id_state")
			WebElement State;
			@FindBy(id="postcode")
			WebElement postcode;
			@FindBy(id="id_country")
			WebElement Country;
			
			@FindBy(id="phone_mobile")
			WebElement MobNumber;
			@FindBy(id="alias")
			WebElement referance;
			@FindBy(id="submitAddress")
			WebElement Saveadress;
			
			
			// methods for performing action on WebElements
			
			public void selectGender() {
				Selectgender.click();
			}
			public void entercustomerFirstName(String firstname) {
				customer_firstname.sendKeys(firstname);
			}
			public void entercustomerLastName(String lastname) {
				customer_lastname.sendKeys(lastname);
			}
			public void enterpassword(String passwd) {
				password.sendKeys(passwd);
			}
			public void clickregistrationbutton() {
				Registerbutton.click();
			}
			public void clickaddresslink() {
				Add_myFirst_Adress.click();
			}
			public void enterAdressLine1(String adress) {
				Adress.sendKeys(adress);
			}
			public void enterCity(String City) {
				city.sendKeys(City);
			}
			public void selectState(String text) {
				Select s=new Select(State);
				s.selectByVisibleText(text);
				//State.click();
			}
			public void enterpostCode(String postcodedata) {
				postcode.sendKeys(postcodedata);
			}
			public void selectCountry(String COUNTRY) {
				Select sele=new Select(Country);
				sele.selectByVisibleText(COUNTRY);
				
				//Country.click();
			}
			public void entermobNumber(String mobnumber) {
				MobNumber.sendKeys(mobnumber);
			}
			public void referance(String referancedetails) {
				referance.sendKeys(referancedetails);
			}
			public void clicksave() {
				Saveadress.click();
			}
			
			
			}
