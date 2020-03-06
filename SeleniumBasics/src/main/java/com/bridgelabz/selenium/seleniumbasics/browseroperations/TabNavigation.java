package com.bridgelabz.selenium.seleniumbasics.browseroperations;

import java.util.Set;

import org.openqa.selenium.By;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

/**
 * Purpose : To check the navigation between tabs of browser
 * 
 * @author Sahil Kudake
 *
 */
public class TabNavigation extends Base {

	public static void navigateBetweenTabs() throws InterruptedException {
		driver.get("https://www.naukri.com");
		Thread.sleep(1000);
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> noOfWindows = driver.getWindowHandles();
		for (String window : noOfWindows) {
			driver.switchTo().window(window);
			Thread.sleep(1000);
		}
		String childTitle = driver.getTitle();
		System.out.println("Title of child tab is " + childTitle);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentWindowHandle);
		Thread.sleep(2000);
		driver.findElement(By.id("login_Layer")).click();

	}

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("unused")
		Base base = new Base();
		navigateBetweenTabs();

	}

}
