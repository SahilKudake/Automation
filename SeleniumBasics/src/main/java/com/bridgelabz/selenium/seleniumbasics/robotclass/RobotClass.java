package com.bridgelabz.selenium.seleniumbasics.robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

/**
 * Purpose : Program to test keyboard clicks and mouse movements using robot and
 * action class
 * 
 * @author Sahil Kudake
 *
 */
public class RobotClass extends Base {

	static Base base;

	public static void main(String[] args) throws InterruptedException, AWTException {
		base = new Base();
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		Robot robot = new Robot();
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_U);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_X);
		robot.keyRelease(KeyEvent.VK_X);
		Thread.sleep(500);
		element.submit();
		Thread.sleep(1000);
		robot.mouseMove(300, 500);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(500);

		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.name("q"));
		action.moveToElement(ele);
		action.click().perform();

		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(500);

		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		Thread.sleep(500);

		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);

		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Galaxy s 10");
		Thread.sleep(1000);
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(300);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(300);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Samsung")).click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com");

	}

}
