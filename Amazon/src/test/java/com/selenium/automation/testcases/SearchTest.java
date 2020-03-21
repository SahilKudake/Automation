package com.selenium.automation.testcases;

import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.automation.base.Base;
import com.selenium.automation.pages.Search;

/**
 * Purpose : To automate amazon application, adding product to cart,
 * 			 changing quantity and deleting the product from cart
 * 
 * @author Sahil Kudake
 *
 */
public class SearchTest extends Base {

	public Search search;

	public SearchTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialize();
		search = new Search();
	}
	
	@Test
	public void open_cartTest() throws InterruptedException {
		search.search_something("iPhone 11 pro max");
		search.pick_item();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		int n = 0;
		for (String window : windows) {
			n++;
			driver.switchTo().window(window);
		}
		if (n == 2) {
			Thread.sleep(500);
			search.add_cart();
		}
		Thread.sleep(500);
		search.open_cart();
		Thread.sleep(1000);
		search.manage_cart();
		Thread.sleep(1000);
		search.delete_item();
		Thread.sleep(1000);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
