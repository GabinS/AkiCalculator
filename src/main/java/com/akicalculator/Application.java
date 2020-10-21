package com.akicalculator;

import com.akicalculator.utils.NavigationUtils;

/**
 * Main Application class.
 */
public class Application {
    
	/**
     * Entry-point of application.
     */
    public static void main(final String[] args) {
        while (true) {
        	System.out.flush();
        	NavigationUtils.printMenu();
        	NavigationUtils.selectMenu();
		}
    } 
    
    
	
}
