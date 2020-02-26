package com.bridgelabz.selenium.SeleniumBasics.popuphandling;

import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.bridgelabz.selenium.SeleniumBasics.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpHandling extends Base {

	static Base base;

	public static void fileUpld() throws InterruptedException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("/home/user/Desktop/Rajinikanth2.jpg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-xs']")).click();
		Thread.sleep(1000);
	}

	public static void fileDownload() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		HashMap<String, Object> chromePref = new HashMap<String, Object>();
		chromePref.put("profile.default_content_setting.popups", 0);
		chromePref.put("download.default_directory", "/home/user/eclipse-workspace/apptest");

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePref);
		options.addArguments("--test-type");
		options.addArguments("--disable-extensions");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("64 bit Windows IE")).click();
		System.out.println("Downloaded");

	}
	
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
		base = new Base();
//		fileUpld();
//		fileDownload();
//		promptHandling();
		hiddenDivisionPopUp();

	}

}
