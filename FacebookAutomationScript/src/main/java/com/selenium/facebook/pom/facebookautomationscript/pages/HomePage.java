package com.selenium.facebook.pom.facebookautomationscript.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.facebook.pom.facebookautomationscript.base.Base;

public class HomePage extends Base {

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement home;
	
	@FindBy(xpath = "//a[contains(text(),'Find Friends')]")
	WebElement findFriends;
	
	@FindBy(className = "_1vp5")
	WebElement profile;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage click_home() {
		home.click();
		return new HomePage();
	}
	
	public FindFriends click_findFriends() {
		findFriends.click();
		return new FindFriends();
	}
	
	public ProfilePage click_profile() {
		profile.click();
		return new ProfilePage();
	}
}
