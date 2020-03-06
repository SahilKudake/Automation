package com.bridgelabz.selenium.seleniumbasics.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Purpose : Base class to set up browser
 * 
 * @author Sahil Kudake
 *
 */
public class Base {

	public static WebDriver driver;

	public Base() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
