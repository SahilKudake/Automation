package com.bridgelabz.selenium.seleniumbasics.popuphandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

/**
 * Purpose : Program to handle prompts of website
 * 
 * @author Sahil Kudake
 *
 */
public class PromptHandling extends Base {
	public static void promptHandling() throws InterruptedException {
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.sendKeys("sahil");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.dismiss();
	}

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("unused")
		Base base = new Base();
		promptHandling();

	}

}
