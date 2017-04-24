package com.test.testngExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	
 @Parameters({"BrowserType"})	
  @Test
  public void RegisterUser() throws Exception {
	  WebDriver driver=null;
	  
	  switch(BrowserType){
	  
	  case "firefox":
		  System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
			driver =new FirefoxDriver();
			bresk;
	  case "chrome":
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			driver =new FirefoxDriver();  
	  
	  
	  
	  }
	  
	  
	  
		driver.get("http://demoaut.com");
		Thread.sleep(3000);
		
		
		 Boolean objStatus=driver.findElement(By.linkText("SIGN-ON")).isDisplayed();
		  Boolean objTrue=true;
		  AssertJUnit.assertEquals(objStatus, objTrue);
  }
}
