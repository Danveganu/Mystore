package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.AccountCreation;
import com.mystore.pageobject.IndexPage;
import com.mystore.pageobject.MyAccount;
import com.mystore.pageobject.UserAccount;

public class TC_MyAccountPage extends BaseClass {

	@Test
	public void verifyRegistrationAndLogin() 
	{
		//oprnURL Index Page
		driver.get(URL);
		driver.manage().window().maximize();
		//Logger.info("URL open");
		IndexPage pg=new IndexPage(driver);
		pg.clickOnSignIn();
		MyAccount Accopg=new MyAccount(driver);
		Accopg.enterCreateemailAdress(randomeString()+"@gmail.com");// randomly generated the email
		//Accopg.enterCreateemailAdress("ganeshdanve8@gmail.com");// randomly generated the email
		Accopg.submitCreate();
		//Account creation page
		AccountCreation accountcr=new AccountCreation(driver);
		accountcr.selectGender();
		//accountcr.entercustomerFirstName(randomeString().toUpperCase()); // this randomstring get from randomstring method
		accountcr.entercustomerFirstName("ganesh");
		//accountcr.entercustomerLastName(randomeString().toUpperCase());
		 accountcr.entercustomerLastName("danve");
		accountcr.enterpassword("00000");
		accountcr.clickregistrationbutton();
		accountcr.clickaddresslink();
		accountcr.enterAdressLine1("pune");
		accountcr.enterCity("chinchwad");
		accountcr.selectState("California");
		accountcr.enterpostCode("00000");
		accountcr.selectCountry("United States");
		accountcr.entermobNumber("9988776655");
		accountcr.referance("patilnagar");
		accountcr.clicksave();
		
		//Resistered user Detail Page
		
		UserAccount ur=new UserAccount(driver);
		String user=ur.userName();
		Assert.assertEquals("Ganesh danve", user);
		}
	
}
