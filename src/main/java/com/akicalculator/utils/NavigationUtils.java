package com.akicalculator.utils;

import java.util.Scanner;

import com.akicalculator.models.Addition;

public class NavigationUtils {

	public static final Scanner scan = new Scanner(System.in);
	
	/**
	 * Display menu in console
	 */
	public static void printMenu () {
	    System.out.println("|      AkiCalculator       |");
	    System.out.println("| Opération:               |");
	    System.out.println("|    [1] Addition          |");
	    System.out.println("|[E] Exit                  |");
	}
	
	
	/**
	 * Select action in menu
	 */
	public static void selectMenu() {
		String menuSelected = null;
		Boolean validMenu = false;
		while(!validMenu) {
		    System.out.println("Choix du menu : ");
		    menuSelected = scan.nextLine();
		    validMenu = true;
		    
		    switch (menuSelected) {
			case "1":
				System.out.println("Addition");
				execAddition();
				break;
			case "E":
				System.exit(0);
				break;

			default:
				System.out.println("Choix du menu invalide !");
				validMenu = false;
				break;
			}
		    
		}
	}

	/**
	 * Launch Addition navigation
	 */
	public static void execAddition() {
		float a = 0;
		float b = 0;
		System.out.println("a = ");
		a = scan.nextFloat();
		System.out.println("b = ");
		b = scan.nextFloat();
		
		Addition add = new Addition(a);
		float result = add.apply(b);
		
		System.out.println(String.valueOf(a) + " + " + String.valueOf(b) + " = " + String.valueOf(result));
		
	}
}
