package com.bridgelabz.selenium.seleniumbasics.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

public class MouseClick extends Base {

	public static void mouseClick() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//span[@id='body']//a[1]"));
		Actions action = new Actions(driver);
		Thread.sleep(500);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		WebElement menu = driver.findElement(By.linkText("हिन्दी"));
		Thread.sleep(1000);
		menu.click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	public static void main(String[] args) throws InterruptedException {
		Base base = new Base();
		mouseClick();

	}

}
