package com.selenium.faceboo.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.facebook.pom.facebookautomationscript.base.Base;
import com.selenium.facebook.pom.facebookautomationscript.pages.FindFriends;
import com.selenium.facebook.pom.facebookautomationscript.pages.HomePage;
import com.selenium.facebook.pom.facebookautomationscript.pages.Login;

public class FindFriendTest extends Base {

	Login login;
	HomePage homePage;
	FindFriends findFriends;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		Initialize();
		login = new Login();
		findFriends = new FindFriends();
		homePage = login.facebook_login(properties.getProperty("username"), properties.getProperty("password"));
	}

	@Test(priority = 1)
	public void find_friend() {
		findFriends.click_find_friends();
	}
	
	@Test(priority = 2)
	public void add_friend() {
		findFriends.click_add_friend();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
