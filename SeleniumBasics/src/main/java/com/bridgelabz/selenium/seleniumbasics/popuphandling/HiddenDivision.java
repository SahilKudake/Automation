package com.bridgelabz.selenium.seleniumbasics.popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

/**
 * Purpose : Program to handle hidden division pop up
 * 
 * @author Sahil Kudake
 *
 */
public class HiddenDivision extends Base {
	public static void hiddenDivisionPopUp() throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--disable-geolocation");
		option.addArguments("--ignore-certificate-errors");
		driver = new ChromeDriver(option);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("24")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("unused")
		Base base = new Base();
		hiddenDivisionPopUp();

	}

}
