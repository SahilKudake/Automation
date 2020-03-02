package com.bridgelabz.selenium.seleniumbasics.locators;

import org.openqa.selenium.By;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

/**
 * Purpose : program to check the locators present in facebook website
 * 
 * @author Sahil Kudake
 *
 */
public class Locators extends Base {

	static Base base;

	public static void main(String[] args) throws InterruptedException {
		base = new Base();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("8109555221");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("testdata@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#userNavigationLabel")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
	}

}
