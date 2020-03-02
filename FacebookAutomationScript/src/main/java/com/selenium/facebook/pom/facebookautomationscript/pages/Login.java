package com.selenium.facebook.pom.facebookautomationscript.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.facebook.pom.facebookautomationscript.base.Base;

/**
 * Purpose : Program to login to facebook
 * 
 * @author Sahil Kudake
 *
 */
public class Login extends Base {

	@FindBy(id = "email")
	WebElement username;

	@FindBy(name = "pass")
	WebElement password;

	@FindBy(id = "loginbutton")
	WebElement loginButton;

	public Login() {
		PageFactory.initElements(driver, this);
	}

	public String verifyLoginPage() {
		
		return driver.getTitle();
		
	}

	public HomePage facebook_login(String uname, String pass) throws InterruptedException {
		username.clear();
		username.sendKeys(uname);
		Thread.sleep(1000);
		password.clear();
		password.sendKeys(pass);
		Thread.sleep(1000);
		loginButton.click();

		return new HomePage();
	}

}
