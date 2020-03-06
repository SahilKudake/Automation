package com.selenium.hybridframework.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Purpose : Program to set up the browser for testing
 * 
 * @author Sahil Kudake
 *
 */
public class Base {
	
	public static WebDriver driver;

	public static void initialize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(401, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}
}
