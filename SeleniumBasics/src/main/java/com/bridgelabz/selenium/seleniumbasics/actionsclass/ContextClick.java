package com.bridgelabz.selenium.seleniumbasics.actionsclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

/**
 * Purpose : Test to open the link in new tab using Actions class
 * 
 * @author Sahil Kudake
 *
 */
public class ContextClick extends Base {

	public static void contextClickUsingActions() throws AWTException, InterruptedException {
		driver.get("http://www.actimind.com/");

		Thread.sleep(2000);
		WebElement abt = driver.findElement(By.linkText("ABOUT COMPANY"));

		Actions actions = new Actions(driver);
		actions.contextClick(abt).perform();
		Thread.sleep(3000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);

	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		@SuppressWarnings("unused")
		Base base = new Base();
		contextClickUsingActions();

	}

}
