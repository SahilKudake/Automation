package com.bridgelabz.selenium.SeleniumBasics.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.bridgelabz.selenium.SeleniumBasics.base.Base;

public class Implicit extends Base {

	static Base base;
	public static void main(String[] args) throws InterruptedException {
		base = new Base();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Waited for 10 seconds");
		Thread.sleep(1000);
		driver.findElement(By.className("RNkmpXc")).click();;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
