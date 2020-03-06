package com.bridgelabz.selenium.seleniumbasics.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

/**
 * Purpose : Program to add wait time in a process
 * 
 * @author Sahil Kudake
 *
 */
public class Implicit extends Base {

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("unused")
		Base base = new Base();
		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("Waited for 10 seconds");
		Thread.sleep(1000);
		driver.findElement(By.className("RNkmpXc")).click();
		;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
