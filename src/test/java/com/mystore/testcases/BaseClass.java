package com.mystore.testcases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mystore.utility.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readconfig=new ReadConfig();
	String URL=readconfig.getBaseUrl();
	String browser=readconfig.getBrowser();

	public static WebDriver driver;
	//public static Logger Logger;
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//For logging
		//Logger=LogManager.getLogger("MyStore");
	}

	public String randomeString() {
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
		
	}
	@AfterClass
	public void tearDown() {
		//driver.close();
		//driver.quit();
	}


}
