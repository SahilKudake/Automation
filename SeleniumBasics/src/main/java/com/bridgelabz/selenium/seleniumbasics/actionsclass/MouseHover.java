package com.bridgelabz.selenium.seleniumbasics.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

/**
 * Purpose : To test the mouse hover operation
 * 
 * @author Sahil Kudake
 *
 */
public class MouseHover extends Base {

	public static void mouseHover() throws InterruptedException {
		driver.get("http://www.actimind.com/");
		Actions action = new Actions(driver);
		WebElement AreaOfExpertise = driver.findElement(By.xpath("//a[contains(text(),'AREAS OF EXPERTISE')]"));
		Thread.sleep(2000);
		action.moveToElement(AreaOfExpertise).perform();
		Thread.sleep(2000);
		WebElement cloudApp = driver.findElement(By.linkText("Cloud Applications"));
		action.moveToElement(cloudApp).click().perform();
	}

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("unused")
		Base base = new Base();
		mouseHover();

	}

}
