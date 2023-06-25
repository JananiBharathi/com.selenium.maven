package com.auto.step_definition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.auto.PageObjects.LoginObjectPage;
import com.auto.utilities.Common_Utils;
import com.auto.webdriver_manager.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Common_Step_Definition {
	
	@Before
	public void beforeScenario(){
		try {
			
			Common_Utils cmnObj = new Common_Utils();
			cmnObj.loadProperties();
			if(DriverManager.getDriver()==null) {
				DriverManager.launchBrowser();	
				PageFactory.initElements(DriverManager.getDriver(), LoginObjectPage.class);
			}
		}
		catch ( Exception e){
			e.printStackTrace();
		}
	}
//	@After
//	public void afterTakeScreenshot() throws IOException {
////		((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		
//		TakesScreenshot scrnShot = (TakesScreenshot) DriverManager.getDriver();
//	File scrFile =	scrnShot.getScreenshotAs(OutputType.FILE);
//	File desFile = new File("/test-screenshot/output.png");
//		FileUtils.copyFile(scrFile, desFile);
//		
//	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario){

	      final byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	      scenario.attach(screenshot, "image/png", "image"); 
		
	}
}
