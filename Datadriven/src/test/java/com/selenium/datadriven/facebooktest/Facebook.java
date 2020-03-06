package com.selenium.datadriven.facebooktest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.datadriven.config.ExcelConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Purpose : To test the facebook login page using data driven framework
 * 
 * @author Sahil Kudake
 *
 */
public class Facebook {

	@Test(dataProvider = "facebook")
	public static void facebookLogin(String uname, String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.name("pass")).sendKeys(pass);
		driver.findElement(By.id("loginbutton")).click();
	}

	@DataProvider(name = "facebook")
	public Object[][] loginData() {
		ExcelConfig ec = new ExcelConfig();
		ec.configurExcelSheet("facebookLogin.xlsx");
		int row = ec.size(0);
		Object[][] obj = new Object[row][2];
		for (int i = 0; i < row; i++) {
			String str = (String) ec.getData(0, i, 0);
			obj[i][0] = str;
			obj[i][1] = ec.getData(0, i, 1).toString();
		}

		return obj;
	}

}
