package com.bridgelabz.selenium.seleniumbasics.actionsclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

public class ActionClass extends Base {


	public static void dragAndDrop() throws InterruptedException {

		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");

		WebElement block1 = driver.findElement(By.xpath("//h1[.='Block 1']"));

		WebElement block2 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.dragAndDrop(block1, block2).perform();
		Thread.sleep(2000);
		actions.dragAndDrop(block2, block1).perform();
	}

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

	public static void main(String[] args) throws InterruptedException, AWTException {
		@SuppressWarnings("unused")
		Base base = new Base();
//		dragAndDrop();
//		mouseHover();
		contextClickUsingActions();

	}

}
