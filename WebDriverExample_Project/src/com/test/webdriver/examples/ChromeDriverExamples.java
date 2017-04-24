package com.test.webdriver.examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeDriverExamples {

	public static void main(String[] args) throws Exception
	
	{
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver.get("http://demoaut.com");
		//driver.close();
		
		/*WebDriver driver1=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver1.get("http://demoaut.com");
		//driver1.close();
		
		WebDriver driver2=new InternetExplorerDriver();
		System.setProperty("webdriver.ie.driver", "C:\\selenium\\IEDriverServer.exe");
		driver2.get("http://demoaut.com");
		driver2.close();*/
	
		
		Thread.sleep(5000);
		driver.get("http://demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		
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
		
		
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(3000);
		
				
		List <WebElement> Radiobtn=driver.findElements(By.name("tripType"));
		boolean bvalue=false;
		bvalue= Radiobtn.get(0).isSelected();
		if(bvalue==true){
			Radiobtn.get(1).click();
		}
		else
		{
			 Radiobtn.get(0).click();
		}
		
				
		driver.close();
	
		
		
		//List tripType=driver.findElements(By.name("tripType"))//for multiple elements we use list
		
		//WebElement tripType=driver.findElement(By.name("tripType"));//one element web element
		// tripType.click();
		//driver.manage().window().maximize();
			
			
		
		
	
	}
	
	
	
	
	

}
