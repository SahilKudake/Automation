package com.bridgelabz.selenium.seleniumbasics.browseroperations;

import java.util.Set;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

/**
 * Purpose : Program to close child window of browser
 * 
 * @author Sahil Kudake
 *
 */
public class CloseChildWindow extends Base {

	public static void closeChildWindows() throws InterruptedException {

		driver.get("https://www.naukri.com");
		Thread.sleep(1000);
		String parentWindowHandleId = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		String title = driver.getTitle();
		System.out.println("No of windows: " + count);
		for (String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
			if (!windowHandle.equals(parentWindowHandleId)) {
				driver.close();
				System.out.println(title + " named window closed!");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("unused")
		Base base = new Base();
		closeChildWindows();

	}

}
