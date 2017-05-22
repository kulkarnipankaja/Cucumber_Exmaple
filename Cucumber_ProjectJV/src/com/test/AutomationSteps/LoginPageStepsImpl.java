package com.test.AutomationSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepsImpl {
	WebDriver driver;

@Given("^user is in the amazon\\.com homepage$")
public void user_is_in_the_amazon_com_homepage() throws Throwable {
	
	System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
	driver =new FirefoxDriver();
	driver.get("http://demoaut.com");
	Thread.sleep(3000);
	}

@When("^user clicks on Login Button$")
public void user_clicks_on_Login_Button() throws Throwable {
	System.out.println("code to Click Login Button");
}

@Then("^Login page should be displayed$")
public void login_page_should_be_displayed() throws Throwable {
	System.out.println("code to Verify Login Page");
	
}



@Then("^email should be displayed$")
public void email_should_be_displayed() throws Throwable {
   
}

@Then("^Pw should be displayed$")
public void pw_should_be_displayed() throws Throwable {
   
}

@Then("^Sign in button should be displayed$")
public void sign_in_button_should_be_displayed() throws Throwable {
    
}


}
