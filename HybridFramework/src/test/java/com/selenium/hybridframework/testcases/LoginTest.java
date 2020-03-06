package com.selenium.hybridframework.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.hybridframework.base.Base;
import com.selenium.hybridframework.config.ExcelConfig;
import com.selenium.hybridframework.pages.FbLogin;

/**
 * Purpose : To test the facebook login page using data hybrid framework
 * 
 * @author Sahil Kudake
 *
 */
public class LoginTest extends Base {

	FbLogin fl;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialize();
		fl = new FbLogin();
	}

	@Test(dataProvider = "facebookData")
	public void login(String uname, String pass) throws InterruptedException {
		fl.facebookLogin(uname, pass);
	}

	@DataProvider(name = "facebookData")
	public Object[][] fbData() {
		ExcelConfig excel = new ExcelConfig();
		excel.configExcelsheet("/home/admin1/eclipse-workspace/HybridFramework/facebookLogin.xlsx");
		int row = excel.size(0);
		Object[][] obj = new Object[row][2];
		for (int i = 0; i < row; i++) {
			String uname = (String) excel.getData(0, i, 0);
			obj[i][0] = uname;
			String pass = (String) excel.getData(0, i, 1);
			obj[i][1] = pass;
		}
		return obj;
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
