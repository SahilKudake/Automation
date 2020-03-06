package com.bridgelabz.selenium.seleniumbasics.actionsclass;

import org.openqa.selenium.JavascriptExecutor;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

public class MouseScroll extends Base {

	public static void amazon() throws InterruptedException {
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		for (int i = 1; i < 5; i++) {
			je.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(500);
		}
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("unused")
		Base base = new Base();
		amazon();

	}

}
