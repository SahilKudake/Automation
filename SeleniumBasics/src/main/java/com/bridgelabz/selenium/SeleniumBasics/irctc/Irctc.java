package com.bridgelabz.selenium.SeleniumBasics.irctc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.bridgelabz.selenium.SeleniumBasics.base.Base;

public class Irctc extends Base {

	static Base base;
	
	public static void irctc() throws InterruptedException {

		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		Thread.sleep(500);
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		Thread.sleep(2000);
		je.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("TestUser1258");
		Thread.sleep(1000);
		driver.findElement(By.id("usrPwd")).sendKeys("TestUserPassword@3215");
		Thread.sleep(1000);
		driver.findElement(By.id("cnfUsrPwd")).sendKeys("TestUserPassword@3215");
		Thread.sleep(1000);
		je.executeScript("document.getElementById('userName').value=''"); //clearing the value
		Thread.sleep(1000);
		je.executeScript("document.getElementById('userName').value='WeAreTestingIt'");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='ng-tns-c10-4 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Who was your Childhood hero?')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Security Answer']")).sendKeys("HritikRoshan");
		Thread.sleep(1000);
		je.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		//language
		driver.findElement(By.xpath("//div[@class='ng-tns-c10-5 ui-dropdown ui-widget ui-state-default ui-corner-all ui-helper-clearfix']//span[@class='ui-dropdown-trigger-icon ui-clickable fa fa-fw fa-caret-down']")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'English')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).sendKeys("This is firstName Test");
		Thread.sleep(1000);
		driver.findElement(By.id("middleName")).sendKeys("This is middleName test");
		Thread.sleep(1000);
		driver.findElement(By.id("lastname")).sendKeys("This is lastName Test");
		Thread.sleep(1000);
		driver.findElement(By.id("M")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("F")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("T")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("M")).click();
		Thread.sleep(1000);
		je.executeScript("window.scrollBy(0,400)");	
		Thread.sleep(1000);
		//calendar
		driver.findElement(By.xpath("//input[@class='ng-tns-c11-6 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'1995')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'November')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@class='ng-tns-c11-6 ng-star-inserted']//a[@class='ui-state-default ng-tns-c11-6 ng-star-inserted'][contains(text(),'29')]")).click();
		Thread.sleep(1000);
		//occupation
		driver.findElement(By.xpath("//label[@class='ng-tns-c10-7 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'STUDENT')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'Unmarried')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-valid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='col-md-3 col-sm-3 col-xs-12 inlineBlock']//option[106]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("mobile")).sendKeys("9875462156");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='col-md-4 col-sm-4 col-xs-12 inlineBlock']//select[@class='form-control ng-untouched ng-pristine ng-invalid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='col-md-4 col-sm-4 col-xs-12 inlineBlock']//option[106]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("resAddress1")).sendKeys("bridgelabz solutions, malhotra chambers, Govandi east");
		Thread.sleep(1000);
		je.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Pin code']")).sendKeys("400088");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='col-md-4 col-sm-4 col-xs-12 inlineBlock ng-star-inserted']//select[@class='form-control ng-untouched ng-pristine ng-invalid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'Mumbai')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-invalid ng-touched']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'Govandi S.O')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("resPhone")).sendKeys("9987564256");
		Thread.sleep(1000);
		
				
		}
	
	
	public static void main(String[] args) throws InterruptedException {
		base = new Base();
		irctc();
	}

}
