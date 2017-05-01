package com.test.selenium.rc;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstScript {
	@SuppressWarnings("deprecation")
	private Selenium selenium;

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://www.amazon.com/");
		selenium.start();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testUntitled() throws Exception {
		selenium.open("/");
		selenium.click("css=#nav-link-accountList > span.nav-line-2");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=ap_email", "seletest@testskiljfkds.com");
		selenium.type("id=ap_password", "chkjljlklkk");
		selenium.click("id=signInSubmit");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=createAccountSubmit");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Sign in");
		selenium.waitForPageToLoad("30000");
	}

	@SuppressWarnings("deprecation")
	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
