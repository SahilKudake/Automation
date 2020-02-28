package com.selenium.facebook.pom.facebookautomationscript.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.facebook.pom.facebookautomationscript.base.Base;

public class FindFriends extends Base {

	@FindBy(id = "findFriendsNav")
	WebElement findFriends;
	
	@FindBy(xpath = "//div[@id='u_fetchstream_2_8']//button[@class='_42ft _4jy0 FriendRequestAdd addButton _4jy3 _4jy1 selected _51sy'][contains(text(),'Add Friend')]")
	WebElement addFriend;

	public FindFriends() {
		PageFactory.initElements(driver, this);
	}
	
	public FindFriends click_find_friends() {
		findFriends.click();
		return new FindFriends();
	}
	
	public FindFriends click_add_friend() {
		addFriend.isEnabled();
		addFriend.click();
		return new FindFriends();
	}
	
	
	
	
}
