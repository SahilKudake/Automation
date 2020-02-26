package com.bridgelabz.selenium.apptest.apptest.sitetest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void fbLogin() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://facebook.com");
		Thread.sleep(500);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(500);
		driver.findElement(By.id("email")).sendKeys("8109555221");
		driver.findElement(By.id("pass")).sendKeys("testdata@1234");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("/home/user/eclipse-workspace/apptest/screenshot/actiTIMELoginPage.png");
		FileUtils.copyFile(srcFile, destFile);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(@text()='Log Out')]")).click();
		
	}
}