package com.auto.utilities;


import java.util.Properties;

import com.auto.constants.Constants;

public class Common_Utils {

	public void loadProperties(){
		
//		FileReader reader = null;
		
//		try {
//			reader = new FileReader("config.properties");
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
		Properties properties = new Properties();
//		try {
//			properties.load(reader);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	Constants.APP_URL =	properties.getProperty("APP_URL");
	Constants.BROWSER =	properties.getProperty("BROWSER");
	Constants.UserName=	properties.getProperty("UserName");
	Constants.Password=	properties.getProperty("Password");
	Constants.CHROME_DRIVER_LOCATION =	properties.getProperty("CHROME_DRIVER_LOCATION");
	Constants.FIREFOX_DRIVER_LOCATION =	properties.getProperty("FIREFOX_DRIVER_LOCATION");
	Constants.IE_DRIVER_LOCATION =	properties.getProperty("IE_DRIVER_LOCATION");
	}
}
