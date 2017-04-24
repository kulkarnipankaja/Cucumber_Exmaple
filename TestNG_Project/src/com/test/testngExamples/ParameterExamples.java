package com.test.testngExamples;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

@Test
public class  ParameterExamples {
	WebDriver driver;
  public void RegisterUser() throws Exception {
	 driver.findElement(By.linkText("REGISTER")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.name("firstName")).sendKeys("Selenium First");
	 driver.findElement(By.name("lastName")).sendKeys("Selenium Last");
	 driver.findElement(By.name("register")).click();
  }
  
  @Parameters({"LoginName","password"})
  @Test
  public void PurchaseTicket(String userName,String password)throws Exception{
	  
	  driver.findElement(By.linkText("SIGN-ON")).click();
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mecury0");
	  driver.findElement(By.name("login")).click();
  }
  
  
  
  
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	 //Assert in TeastNG comparing with boolean values .assert is useed for validation
	  Boolean objStatus=driver.findElement(By.linkText("SIGN-ON")).isDisplayed();
	  Boolean objTrue=true;
	  AssertJUnit.assertEquals(objStatus, objTrue);
	  	 
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://demoaut.com");
		Thread.sleep(3000);
		System.out.println("Inside Before method");
//		reporter.log to log the results
//		if(driver.findElement(By.linkText("SIGN-ON")).isDisplayed())
//		{
//			
//			Reporter.log("PASS:Home page is displayed");
//			
//			
//		}
//		else{
//			
//			Reporter.log("FAIL:Home page is not displayed");
//		}
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
