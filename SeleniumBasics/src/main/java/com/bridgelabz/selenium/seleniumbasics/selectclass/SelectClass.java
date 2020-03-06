package com.bridgelabz.selenium.seleniumbasics.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bridgelabz.selenium.seleniumbasics.base.Base;

/**
 * Purpose : Program to select values from checkbox and combobox using select
 * class
 * 
 * @author Sahil Kudake
 *
 */
public class SelectClass extends Base {

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("unused")
		Base base = new Base();
		driver.get("file:///home/admin1/eclipse-workspace/SeleniumBasics/breakfastList.html");
		WebElement element = driver.findElement(By.id("menu"));
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println("No of checkbox: " + size);
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("v");
		Thread.sleep(1000);
		select.selectByVisibleText("POORI");
		Thread.sleep(1000);
		List<WebElement> allOptions = select.getAllSelectedOptions();

		for (WebElement we : allOptions) {
			System.out.println(we.getText());
		}

		boolean multiple = select.isMultiple();
		System.out.println(multiple + " yes it is multiple select.");
		if (multiple) {
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			System.out.println("first selected item: " + firstSelectedOption.getText());
			Thread.sleep(1000);
			select.deselectByIndex(0);
			WebElement firstSelectedOption2 = select.getFirstSelectedOption();
			System.out.println("first selected item: " + firstSelectedOption2.getText());
			Thread.sleep(1000);
			select.deselectByVisibleText("POORI");
		}

	}

}
