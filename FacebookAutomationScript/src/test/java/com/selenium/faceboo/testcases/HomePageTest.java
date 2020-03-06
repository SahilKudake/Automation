package com.selenium.faceboo.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.facebook.pom.facebookautomationscript.base.Base;
import com.selenium.facebook.pom.facebookautomationscript.pages.FindFriends;
import com.selenium.facebook.pom.facebookautomationscript.pages.HomePage;
import com.selenium.facebook.pom.facebookautomationscript.pages.Login;
import com.selenium.facebook.pom.facebookautomationscript.pages.ProfilePage;

/**
 * Purpose : Program to test the navigation on home page of facebook
 * 
 * @author Sahil Kudake
 *
 */
public class HomePageTest extends Base {

	Login login;
	HomePage homePage;
	FindFriends findFriends;
	ProfilePage profilePage;

	@BeforeMethod
	public void setup() throws InterruptedException {
		Initialize();
		login = new Login();

		findFriends = new FindFriends();
		profilePage = new ProfilePage();
		homePage = login.facebook_login(properties.getProperty("username"), properties.getProperty("password"));
		homePage.click_home();
	}

	@Test(priority = 1)
	public void verify_profile_link() {
		driver.findElement(By.xpath("//a[@class='_2s25 _606w']"));
		profilePage = homePage.click_profile();
	}

	@Test(priority = 2)
	public void verify_find_friends() {
		driver.findElement(By.id("findFriendsNav"));
		findFriends = homePage.click_findFriends();
	}

	@Test(priority = 3)
	public void verify_home_page() {
		driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		homePage = homePage.click_home();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
