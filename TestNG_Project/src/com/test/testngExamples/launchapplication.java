package com.test.testngExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchapplication {
	
	public void openapp() throws Exception{
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://demoaut.com");
		Thread.sleep(3000);
		System.out.println("Inside Before method");
		
		
	}

}
