package com.bridgelabz.selenium.seleniumbasics.popuphandling;

import org.openqa.selenium.By;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

/**
 * Purpose : Program to upload file on website
 * 
 * @author Sahil Kudake
 *
 */
public class FileUpld extends Base {

	public static void fileUpld() throws InterruptedException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("/home/user/Desktop/Rajinikanth2.jpg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-xs']")).click();
		Thread.sleep(1000);
	}

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("unused")
		Base base = new Base();
		fileUpld();

	}

}
