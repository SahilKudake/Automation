package com.bridgelabz.selenium.seleniumbasics.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

/**
 * Purpose : To check the drag and drop functionality on web application
 * 
 * @author Sahil Kudake
 *
 */
public class DragDrop extends Base {

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

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("unused")
		Base base = new Base();
		dragAndDrop();

	}

}
