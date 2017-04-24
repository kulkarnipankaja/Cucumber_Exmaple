package com.test.testngExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SecondTest {
  @Test
  public void f() {
	  System.out.println("Second Test -Test");;
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Second Test @Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Second Test @ After Method");
	  
	  
  }

}
