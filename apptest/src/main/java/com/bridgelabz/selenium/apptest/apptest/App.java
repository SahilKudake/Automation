package com.bridgelabz.selenium.apptest.apptest;

import java.awt.AWTException;
import java.io.IOException;

import com.bridgelabz.selenium.apptest.apptest.sitetest.Amazon;
import com.bridgelabz.selenium.apptest.apptest.sitetest.ChromeFileDownload;
import com.bridgelabz.selenium.apptest.apptest.sitetest.Facebook;
import com.bridgelabz.selenium.apptest.apptest.sitetest.FileUpload;
import com.bridgelabz.selenium.apptest.apptest.sitetest.FireFox;
import com.bridgelabz.selenium.apptest.apptest.sitetest.Gmail;
import com.bridgelabz.selenium.apptest.apptest.sitetest.Google;
import com.bridgelabz.selenium.apptest.apptest.sitetest.Gooogle;
import com.bridgelabz.selenium.apptest.apptest.sitetest.Irctc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, AWTException, IOException
    {
    	
    	Facebook.fbLogin();
//    	Gmail.gmailLogin();
//        Google.mouse_and_keyboard_movement();
//    	Irctc.irctc();
//        FireFox.fileDownload();
//        Amazon.amazon();
//        driver.close();
//          FileUpload.FileUpld();
//        Gooogle.mouse();
//    	ChromeFileDownload.fileDownload();
    }
}
