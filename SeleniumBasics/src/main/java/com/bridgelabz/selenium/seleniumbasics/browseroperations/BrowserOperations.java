package com.bridgelabz.selenium.seleniumbasics.browseroperations;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

public class BrowserOperations extends Base {

	static Base base;
	
	public static void closeMainWindowOnly() throws InterruptedException {
		
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
	
	public static void navigateBetweenTabs() throws InterruptedException {
		driver.get("https://www.naukri.com");
		Thread.sleep(1000);
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> noOfWindows = driver.getWindowHandles();
		for(String window : noOfWindows) {
			driver.switchTo().window(window);
			Thread.sleep(1000);
		}
		String childTitle = driver.getTitle();
		System.out.println("Title of child tab is "+childTitle);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentWindowHandle);
		Thread.sleep(2000);
		driver.findElement(By.id("login_Layer")).click();
		
	}
	
	public static void hiddenAndVisibleLinks() {
		driver.get("https://www.amazon.in");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int totalLinks = links.size();
		System.out.println("Total no of links: "+totalLinks);
		int visibleLinks = 0;
		int hiddenLinks = 0;
		for(WebElement link : links) {
			if(link.isDisplayed()) {
				visibleLinks++;
				System.out.println(visibleLinks+" --> "+link.getText());
			}else {
				hiddenLinks++;
			}
		}
		System.out.println("Total visible links: "+visibleLinks);
		System.out.println("Total hidden links: "+hiddenLinks);
	}
	public static void main(String[] args) throws InterruptedException {
		base = new Base();
//		closeMainWindowOnly();
//		closeChildWindows();
//		closeSpecifiedBrowser();
//		navigateBetweenTabs();
		hiddenAndVisibleLinks();

	}

}
