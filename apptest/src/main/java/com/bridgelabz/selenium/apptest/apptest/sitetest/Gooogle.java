package com.bridgelabz.selenium.apptest.apptest.sitetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gooogle {

	public static void mouse() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//span[@id='body']//a[1]"));
		Actions action = new Actions(driver);
		Thread.sleep(500);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		WebElement menu = driver.findElement(By.linkText("हिन्दी"));
		Thread.sleep(1000);
		menu.click();
	}
}
