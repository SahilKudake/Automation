package com.bridgelabz.selenium.apptest.apptest.sitetest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void amazon() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		for(int i = 1; i<5; i++) {
			je.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(500);
		}
	}
}
