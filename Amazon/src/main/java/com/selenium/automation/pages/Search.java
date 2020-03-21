package com.selenium.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.automation.base.Base;

/**
 * Purpose : program to detect the components on Amazon web application and automate it
 * 
 * @author Sahil Kudake
 *
 */
public class Search extends Base {

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(xpath = "//span[contains(text(),'Apple iPhone 11 Pro Max (256GB) - Space Grey')]")
	WebElement pickItem;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement cart;
	
	@FindBy(xpath = "//a[@id='hlb-view-cart-announce']")
	WebElement openCart;
	
	@FindBy(xpath = "//span[@id='a-autoid-0-announce']")
	WebElement quantityDD;
	
	@FindBy(xpath = "//a[@id='dropdown1_3']")
	WebElement quantity;
	
	@FindBy(xpath = "//input[@value='Delete']")
	WebElement deleteItem;
	
	public Search() {
		PageFactory.initElements(driver, this);
	}
	
	public void search_something(String device) {
		searchbox.sendKeys(device);
		searchbox.submit();
	}
	public void pick_item() {
		pickItem.click();
	}
	
	public void add_cart() {
		cart.click();
	}
	
	public void open_cart() {
		openCart.click();
	}
	
	public void manage_cart() throws InterruptedException {
		quantityDD.click();
		Thread.sleep(500);
		quantity.click();
	}
	
	public void delete_item() {
		deleteItem.click();
	}
	
}
