package com.auto.step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.auto.PageObjects.LoginObjectPage;
import com.auto.constants.Constants;
import com.auto.webdriver_manager.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class open {
	@Given("user is entering google.com")
	public void user_is_entering_google_com() {
//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
		DriverManager.getDriver().get(Constants.APP_URL);
		LoginObjectPage.USERNAME.sendKeys(Constants.UserName);
		LoginObjectPage.PASSWORD.sendKeys(Constants.Password);
		LoginObjectPage.LOGIN_BUTTON.click();
		
	}
	@When("user clicks the search box")
	public void user_clicks_the_search_box() {
//		driver.findElement(By.name("q")).click();
	}
	@When("types the search term as Janani")
	public void types_the_search_term_as_janani() {
//		driver.findElement(By.name("q")).sendKeys("Janani");
//		driver.findElement(By.name("btnK")).click();
		
	}
	@Then("the user should see the search results for Janani")
	public void the_user_should_see_the_search_results_for_janani() {
//		boolean results = driver.findElement(By.partialLinkText("Janani")).isDisplayed();
//		if(results == true) {
//			System.out.println("Success!!!");
//		}
//		else {
//			System.out.println("FAILLLL");
//		}
	}
}
