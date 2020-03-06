package com.bridgelabz.selenium.seleniumbasics.browseroperations;

import java.util.Set;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

/**
 * Purpose : Program to close specific window of browser
 * 
 * @author Sahil Kudake
 *
 */

public class CloseSpecifiedBrowser extends Base {

	public static void closeSpecifiedBrowser() throws InterruptedException {

		driver.get("https://www.naukri.com");
		Thread.sleep(1000);
		String expectedTitle = "Genpact";
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			if (actualTitle.equals(expectedTitle)) {
				driver.close();
				System.out.println(actualTitle + " named window closed!");
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("unused")
		Base base = new Base();
		closeSpecifiedBrowser();

	}

}
