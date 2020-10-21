package com.akicalculator;

import com.akicalculator.utils.NavigationUtils;

public class Application {
	

    public static void main(String[] args) {
        while (true) {
        	System.out.flush();
        	NavigationUtils.printMenu();
        	NavigationUtils.selectMenu();
		}
    } 
    
    
	
}
