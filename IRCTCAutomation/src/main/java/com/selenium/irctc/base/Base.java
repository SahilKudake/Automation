package com.selenium.irctc.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Purpose : Driver setup for chrome browser
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
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
	}
}
