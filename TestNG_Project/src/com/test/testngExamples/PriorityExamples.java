package com.test.testngExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityExamples {
	WebDriver driver;
  @Test (priority=0)
  public void RegisterUser() throws Exception {
		 driver.findElement(By.linkText("REGISTER")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.name("firstName")).sendKeys("Selenium First");
		 driver.findElement(By.name("lastName")).sendKeys("Selenium Last");
		 driver.findElement(By.name("register")).click();
	  }
  
  @Test (priority=1)
public void PurchaseTicket(){
	  
	  driver.findElement(By.linkText("SIGN-ON")).click();
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mecury0");
	  driver.findElement(By.name("login")).click();
  }
  
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  launchapplication la =new launchapplication();
	  la.openapp();
	  	 
		/*System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://demoaut.com");
		Thread.sleep(3000);
		System.out.println("Inside Before method");
		*/
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  
  
  
  
}
