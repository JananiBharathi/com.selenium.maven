package com.auto.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObjectPage{
	
	@FindBy(name = "email")
	public static WebElement USERNAME;
	@FindBy(name = "password")
	public static WebElement PASSWORD;
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement LOGIN_BUTTON;
	
	
}
