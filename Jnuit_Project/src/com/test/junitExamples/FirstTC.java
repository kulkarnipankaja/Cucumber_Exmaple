package com.test.junitExamples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTC {

	WebDriver driver;
	/*@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Exeecution Started");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Exeecution Ended");
	}*/

	@Before
	public void LaunchApplication() throws Exception {
		
		 driver =new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver.get("http://demoaut.com");
		Thread.sleep (5000);
		
		//System.out.println("Code to Launch application");
	}

	@After
	public void CloseApplication() throws Exception {
		
		driver.quit();
		//System.out.println("Closing Application");
	}

	@Test
	public void RegisterUser() throws Exception {

		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.name("firstName")).sendKeys("TesterFirst");
		driver.findElement(By.name("lastName")).sendKeys("TesterLast");
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")).sendKeys("2222222224");
		driver.findElement(By.cssSelector("#userName")).sendKeys("tester@test.com");
		
		Select select=new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("ANGOLA");
		
		driver.findElement(By.name("register")).click();
		Thread.sleep(3000);
		
		String successMsg;
		successMsg=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
		String expMsg="using the user name and password you've just entered.";
		
		if(successMsg.equals(expMsg))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
			
		}
//		fail("Not yet implemented");
		//System.out.println("Register User");
	}
	
	@Test
	public void PurchaseTickets() throws Exception{
		driver.findElement(By.linkText("SIGN-ON")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		String maxLength=driver.findElement(By.name("userName")).getAttribute("maxlength");
		System.out.println("Max length of user name is"+maxLength);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed())
		{
			
			System.out.println("PASS:user is loggeed in");
		}
		else
		{
			System.out.println("FAIL:user could not be logged in");
		}
//		fail("Not yet implemented");
		//System.out.println("Purchase Ticket");
	}
		
		@Test
		public void DeleteTicket() {
//			fail("Not yet implemented");
			System.out.println("Delete Ticket");
	}

}
