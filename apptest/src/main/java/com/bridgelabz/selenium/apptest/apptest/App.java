package com.bridgelabz.selenium.apptest.apptest;

import java.awt.AWTException;
import java.io.IOException;

import com.bridgelabz.selenium.apptest.apptest.sitetest.Amazon;
import com.bridgelabz.selenium.apptest.apptest.sitetest.Facebook;
import com.bridgelabz.selenium.apptest.apptest.sitetest.Gmail;
import com.bridgelabz.selenium.apptest.apptest.sitetest.Google;
import com.bridgelabz.selenium.apptest.apptest.sitetest.Irctc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, AWTException, IOException
    {
    	
//    	Facebook.fbLogin();
//    	Gmail.gmailLogin();
//        Google.mouse_and_keyboard_movement();
    	Irctc.irctc();
        
//        Amazon.amazon();
//        driver.close();
    }
}
