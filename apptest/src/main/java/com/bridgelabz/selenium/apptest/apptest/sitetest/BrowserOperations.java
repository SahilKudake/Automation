package com.bridgelabz.selenium.apptest.apptest.sitetest;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOperations {

//	Closing main window
	public static void closeMainWindowOnly() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(1000);
		String parentWindowHandleId = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		String title = driver.getTitle();
		System.out.println("No of windows: " + count);
		for (String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
			if (windowHandle.equals(parentWindowHandleId)) {
				driver.close();
				System.out.println(title + " named window closed!");
			}
		}
	}

//	Closing child windows
	public static void closeChildWindows() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
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

	public static void closeSpecifiedBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
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
//		closeMainWindowOnly();
//		closeChildWindows();
		closeSpecifiedBrowser();
	}
}
