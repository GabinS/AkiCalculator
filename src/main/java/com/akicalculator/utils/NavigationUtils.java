package com.akicalculator.utils;

import java.util.Scanner;

import com.akicalculator.models.Addition;

/**
 * Navigation for menu
 */
public class NavigationUtils {

	public static final Scanner SCAN = new Scanner(System.in);
	
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
		Boolean validMenu = false;
		while(!validMenu) {
		    System.out.print("Choix du menu : ");
		    String menuSelected = SCAN.nextLine();
		    validMenu = true;
		    
		    switch (menuSelected) {
			case "1":
				System.out.println("\nAddition");
				execAddition();
				break;
			case "E":
				System.out.println("\nVous avez quittez l'application !");
				System.exit(0);
				break;

			default:
				System.out.println("\nChoix du menu invalide !");
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
		System.out.print("a = ");
		a = SCAN.nextFloat();
		System.out.print("b = ");
		b = SCAN.nextFloat();
		
		Addition add = new Addition(a);
		float result = add.apply(b);
		
		System.out.println(String.valueOf(a) + " + " + String.valueOf(b) + " = " + String.valueOf(result) + "\n");
		
	}
}
