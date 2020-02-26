package com.bridgelabz.selenium.apptest.apptest.sitetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void FileUpld() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("/home/user/Desktop/Rajinikanth2.jpg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-xs']")).click();
		Thread.sleep(1000);
		
		
	}
}
