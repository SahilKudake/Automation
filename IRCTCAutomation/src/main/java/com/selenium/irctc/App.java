package com.selenium.irctc;

import com.selenium.irctc.automation.Irctc;
import com.selenium.irctc.base.Base;


/**
 * Purpose : Main program to automate the irctc website
 * 
 * @author Sahil Kudake
 *
 */
public class App extends Base {
	
    public static void main( String[] args ) throws InterruptedException
    {
    	@SuppressWarnings("unused")
		Base base = new Base();
    	Irctc.registerIrctc();
        System.out.println( "Hello World!" );
    }
}
