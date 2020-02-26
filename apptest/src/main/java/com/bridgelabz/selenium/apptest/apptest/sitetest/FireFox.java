package com.bridgelabz.selenium.apptest.apptest.sitetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void fileDownload() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}
}
