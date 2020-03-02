package com.selenium.facebook.pom.facebookautomationscript.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Purpose : Program to select browser and its drivers as user specified
 * 
 * @author Sahil Kudake
 *
 */
public class Base {

	public static WebDriver driver;
	public static Properties properties;
	
	public Base() {
	
		properties = new Properties();
		
		 
		try {
			FileInputStream file = new FileInputStream("/home/admin1/eclipse-workspace/FacebookAutomationScript/src/main/java/com/selenium/facebook/pom/facebookautomationscript/config/config.properties");
			properties.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void Initialize() {
		String browserName = properties.getProperty("browser");
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			driver = new ChromeDriver(co);
		}
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));
	}
	
}
