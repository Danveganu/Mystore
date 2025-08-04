package com.mystore.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties property;   //properties class for read properties file 
	String path="C:\\Users\\hp\\eclipse-workspace\\Mystore\\Configuration\\Config.properties";
	
	//construction
	public ReadConfig()  {
		try {
		property=new Properties();
		
			FileInputStream file= new FileInputStream(path);
			property.load(file);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getBaseUrl() {
		
		String value=property.getProperty("BaseUrl");
		
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Url is Not Specify");
	}
public String getBrowser() {
		
		String value=property.getProperty("browser");
		
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Url is Not Specify in config file");
	}

}
