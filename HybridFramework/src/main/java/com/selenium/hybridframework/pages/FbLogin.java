package com.selenium.hybridframework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.hybridframework.base.Base;

/**
 * Purpose : Program to login on facebook login page
 * 
 * @author Sahil Kudake
 *
 */
public class FbLogin extends Base {
	@FindBy(id = "email")
	WebElement username;

	@FindBy(name = "pass")
	WebElement password;

	@FindBy(id = "loginbutton")
	WebElement lb;

	public FbLogin() {
		PageFactory.initElements(driver, this);
	}

	public void facebookLogin(String uname, String pass) throws InterruptedException {
		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pass);
		Thread.sleep(500);
		lb.click();

	}

}
