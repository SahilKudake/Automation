package com.bridgelabz.selenium.seleniumbasics.browseroperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

/**
 * Purpose : Program to check and count hidden and visible links on web
 * application
 * 
 * @author Sahil Kudake
 *
 */
public class HiddenAndVisibleLinks extends Base {

	public static void hiddenAndVisibleLinks() {
		driver.get("https://www.amazon.in");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int totalLinks = links.size();
		System.out.println("Total no of links: " + totalLinks);
		int visibleLinks = 0;
		int hiddenLinks = 0;
		for (WebElement link : links) {
			if (link.isDisplayed()) {
				visibleLinks++;
				System.out.println(visibleLinks + " --> " + link.getText());
			} else {
				hiddenLinks++;
			}
		}
		System.out.println("Total visible links: " + visibleLinks);
		System.out.println("Total hidden links: " + hiddenLinks);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Base base = new Base();
		hiddenAndVisibleLinks();

	}

}
