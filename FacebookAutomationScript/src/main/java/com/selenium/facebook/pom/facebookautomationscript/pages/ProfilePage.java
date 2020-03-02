package com.selenium.facebook.pom.facebookautomationscript.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.facebook.pom.facebookautomationscript.base.Base;

/**
 * Purpose : Program to navigate to profile page and change the profile photo
 * 
 * @author Sahil Kudake
 *
 */
public class ProfilePage extends Base {

	@FindBy(xpath = "//a[@class='_2s25 _606w']")
	WebElement profilePage;
	
	@FindBy(xpath = "//div[@class='_156n _23fw _1o59']")
	WebElement profilePhoto;
	
	@FindBy(xpath = "//a[@class='_3cia']")
	WebElement photoUpload;
	
	@FindBy(xpath = "//button[@class='_4jy0 _4jy3 _4jy1 _51sy selected _42ft']")
	WebElement saveButton;
	
	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickProfilePage() {
		profilePage.click();
	}
	
	public boolean verifyProfilePage() {
		return profilePage.isDisplayed();
	}
	
	public ProfilePage click_photoUpload() throws AWTException, InterruptedException {
		//click profile page
		profilePage.click();
		Thread.sleep(1000);
		
		//click profile photo
		profilePhoto.click();
		Thread.sleep(1000);
		
		//click upload photo
		photoUpload.click();
		Thread.sleep(1000);
		
		//copy the path of photo
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection stringSelection = new StringSelection("/home/admin1/eclipse-workspace/FacebookAutomationScript/Cat.jpeg");
		clipboard.setContents(stringSelection, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		//click save button
		saveButton.click();
		Thread.sleep(3000);
		return new ProfilePage();
	}
	
	
}
