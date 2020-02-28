package com.selenium.faceboo.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.facebook.pom.facebookautomationscript.base.Base;
import com.selenium.facebook.pom.facebookautomationscript.pages.HomePage;
import com.selenium.facebook.pom.facebookautomationscript.pages.Login;
import com.selenium.facebook.pom.facebookautomationscript.pages.ProfilePage;

public class ProfilePhotoTest extends Base {

	Login login;
	HomePage homePage;
	ProfilePage profilePage;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		Initialize();
		login = new Login();
		profilePage = new ProfilePage();
		homePage = login.facebook_login(properties.getProperty("username"), properties.getProperty("password"));
		homePage.click_profile();
	}
	
	@Test(priority = 1)
	public void click_profilePage() {
		profilePage.clickProfilePage();
	}
	
	@Test(priority = 2)
	public void verifyProfile() {
		profilePage.verifyProfilePage();
	}
	
	@Test(priority = 1)
	public void click_uploadPhoto() throws AWTException, InterruptedException {
		profilePage.click_photoUpload();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
