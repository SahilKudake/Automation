package com.selenium.faceboo.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.facebook.pom.facebookautomationscript.base.Base;
import com.selenium.facebook.pom.facebookautomationscript.pages.HomePage;
import com.selenium.facebook.pom.facebookautomationscript.pages.Login;

/**
 * Purpose : Program to test the login functionality of facebook page
 * 
 * @author Sahil Kudake
 *
 */
public class LoginTest extends Base {

	Login login;
	HomePage homePage;
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		Initialize();
		login = new Login();
	}
	
	@Test(priority = 1)
	public void verifyLoginPageTest() throws InterruptedException {
		String title = login.verifyLoginPage();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
	}
	
	@Test(priority = 2)
	public void loginTest() throws InterruptedException {
		homePage = login.facebook_login(properties.getProperty("username"), properties.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
