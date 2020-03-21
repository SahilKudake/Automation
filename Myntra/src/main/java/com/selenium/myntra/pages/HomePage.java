package com.selenium.myntra.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.myntra.base.Base;

/**
 * Purpose : Program to automate Myntra web application
 * 
 * @author Sahil Kudake
 *
 */
public class HomePage extends Base {
	
	@FindBy(xpath = "//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")
	WebElement hp;
	
	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	WebElement srchbx;
	
	@FindBy(xpath = "//label[contains(text(),'Men')]")
	WebElement gender;
	
	@FindBy(xpath = "//label[contains(text(),'WROGN')]")
	WebElement brand;
	
	@FindBy(xpath = "//li[2]//a[1]//div[2]//h4[1]")
	WebElement tshirt;
	
	@FindBy(xpath = "//p[@class='size-buttons-unified-size'][contains(text(),'M')]")
	WebElement size;
	
	@FindBy(xpath = "//div[contains(text(),'ADD TO BAG')]")
	WebElement addBag;
	
	@FindBy(xpath = "//span[contains(text(),'GO TO BAG')]")
	WebElement goToBag;
	
	@FindBy(xpath = "//div[contains(@class,'itemComponents-base-quantity')]")
	WebElement qty;
	
	@FindBy(xpath = "//div[@id='3']")
	WebElement chngqty;
	
	@FindBy(xpath = "//button[contains(text(),'Remove')]")
	WebElement rmvitm;
	
	@FindBy(xpath = "//div[contains(@class,'inlinebutton-base-actions')]//div[2]")
	WebElement cnfmrmv;
	
	@FindBy(xpath = "//a[contains(@class,'linkClean')]") 
	WebElement gohp;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void home_page() {
		hp.click();
	}
	
	public void searchT(String t) throws AWTException, InterruptedException {
		srchbx.sendKeys(t);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}
	public void filterT() throws InterruptedException {
		gender.click();
		Thread.sleep(2000);
		brand.click();
	}
	public void selectT() {
		tshirt.click();
	}
	
	public void switchTab() throws InterruptedException {
		int n = 0;
		Set<String> windows = driver.getWindowHandles();
		for(String window : windows) {
			n++;
			driver.switchTo().window(window);
		}
		if(n==2) {
			Thread.sleep(1000);
			size.click();
			Thread.sleep(1000);
			addBag.click();
		}
	}
	
	public void gotoBag() throws InterruptedException {
		goToBag.click();
		Thread.sleep(1000);
	}
	
	public void changeQty() throws InterruptedException {
		qty.click();
		Thread.sleep(1000);
		chngqty.click();
		Thread.sleep(2000);	
	}

	public void removeItem() throws InterruptedException {
		rmvitm.click();
		Thread.sleep(1000);
		cnfmrmv.click();
		Thread.sleep(1000);
		gohp.click();
		Thread.sleep(2000);
	}
}
