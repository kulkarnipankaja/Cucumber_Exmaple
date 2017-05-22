package com.test.AutomationSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonLogin {
	WebDriver driver;
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {

		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://demoaut.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("SIGN-ON")).click();

	    
	}

	@When("^user enters \"([^\"]*)\"email id$")
	public void user_enters_email_id(String email) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(email);
	  	}

	@When("^user enetrs \"([^\"]*)\" pw$")
	public void user_enetrs_pw(String pw) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(pw);
	   
	}


	@When("^Clicks on Sign in Button$")
	public void clicks_on_Sign_in_Button() throws Throwable {
	    
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@Then("^user should be successfully logged in$")
	public void user_should_be_successfully_logged_in() throws Throwable {
		boolean eleststus=driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
	    if (eleststus) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");

		}
	    driver.quit();
	}

}
