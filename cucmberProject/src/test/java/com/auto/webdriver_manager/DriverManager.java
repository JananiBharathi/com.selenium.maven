package com.auto.webdriver_manager;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.auto.constants.Constants;

import io.cucumber.java.AfterStep;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

//	public static final String launchBrowser = null;
	private static WebDriver driver=null;
	
	public static void launchBrowser() {
		
		try {
			switch(Constants.BROWSER) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				setDriver(new ChromeDriver());
				break;
			case "firefox":
//				System.setProperty(Constants.FIREFOX_DRIVER,Constants.FIREFOX_DRIVER);
				WebDriverManager.firefoxdriver().setup();
				setDriver(new ChromeDriver());
				break;
			case "ie":
//				System.setProperty(Constants.IE_DRIVER,Constants.IE_DRIVER_LOCATION);
				WebDriverManager.iedriver().setup();
				setDriver(new ChromeDriver());
				break;
			default:
//				System.setProperty(Constants.CHROME_DRIVER,Constants.CHROME_DRIVER_LOCATION);
				WebDriverManager.chromedriver().setup();
				setDriver(new ChromeDriver());
				break;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		DriverManager.driver = driver;
	}
	

	
}

