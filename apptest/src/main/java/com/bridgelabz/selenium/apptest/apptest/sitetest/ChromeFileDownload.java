package com.bridgelabz.selenium.apptest.apptest.sitetest;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeFileDownload {

	public static void fileDownload() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		HashMap<String, Object> chromePref = new HashMap<String, Object>();
		chromePref.put("profile.default_content_setting.popups", 0);
		chromePref.put("download.default_directory", "/home/user/eclipse-workspace/apptest");
		
		
		
		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("prefs", chromePref);
		options.merge(cap);
		
		WebDriver driver = new ChromeDriver(cap);
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(500);
		
		
		
	}
}
