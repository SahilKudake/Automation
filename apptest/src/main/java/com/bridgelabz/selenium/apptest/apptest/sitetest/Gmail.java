package com.bridgelabz.selenium.apptest.apptest.sitetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {

	public static void gmailLogin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("chintookudake@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.id("passwordNext")).click();
	}
	
}
