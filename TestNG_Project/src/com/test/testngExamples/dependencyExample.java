package com.test.testngExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dependencyExample {
	WebDriver driver;
	  @Test 
	  public void RegisterUser() throws Exception {
			 driver.findElement(By.linkText("REGISTER")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.name("firstName")).sendKeys("Selenium First");
			 driver.findElement(By.name("lastName")).sendKeys("Selenium Last");
			 driver.findElement(By.name("register")).click();
		  }
	  
	  @Test (dependsOnMethods= {"RegisterUser"})
	public void PurchaseTicket(){
		  
		  driver.findElement(By.linkText("SIGN-ON")).click();
		  driver.findElement(By.name("userName")).sendKeys("mercury");
		  driver.findElement(By.name("password")).sendKeys("mecury0");
		  driver.findElement(By.name("login")).click();
	  }
	  
	  @Test (dependsOnMethods ={"PurchaseTicket"})
	  public void DeleteTicket(){
		  
		  System.out.println("Delete Ticket");
	  }
	  
	  @Test 
	  public void Apple(){
		  System.out.println("Apple executes first");
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
		  driver.close();
	  }

	  

}
