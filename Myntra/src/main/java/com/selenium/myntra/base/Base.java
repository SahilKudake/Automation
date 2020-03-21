package com.selenium.myntra.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Purpose : program to set up the browser drivers and run browser
 * 
 * @author Sahil Kudake
 *
 */
public class Base {

	public static WebDriver driver;
	public static void initialize() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
	}
}
