package com.akicalculator.utils;

import java.util.Scanner;

import com.akicalculator.models.Addition;
import com.akicalculator.models.Substraction;
import com.akicalculator.models.Multiplication;

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
	    System.out.println("|    [2] Soustraction      |");
	    System.out.println("|    [3] Multiplication    |");
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
		    
		    switch (menuSelected) {
			case "1":
				System.out.println("\nAddition");
			    validMenu = true;
				execAddition();
				break;
			case "2":
				System.out.println("Soustraction");
				execSubstraction();
			case "3":
				System.out.println("Multiplication");
				execMultiplication();
				break;
			case "E":
				System.out.println("\nVous avez quittez l'application !");
			    validMenu = true;
				System.exit(0);
				break;

			default:
				System.out.println("\nChoix du menu invalide !");
				break;
			}
		    
		}
	}

	/**
	 * Launch Addition navigation
	 */
	public static void execAddition() {
		System.out.print("a = ");
		float valueA = SCAN.nextFloat();
		System.out.print("b = ");
		float valueB = SCAN.nextFloat();
		
		Addition add = new Addition(valueA);
		final float result = add.apply(valueB);
		
		final String msg = valueA + " + " + valueB + " = " + result + "\n";
		System.out.println(msg);
		
	}
	
	/**
	 * Launch Substraction navigation.
	 */
	public static void execSubstraction() {
		System.out.print("a = ");
		float valueA = SCAN.nextFloat();
		System.out.print("b = ");
		float valueB = SCAN.nextFloat();
		
		Substraction add = new Substraction(valueA);
		final float result = add.apply(valueB);
		
		final String msg = valueA + " - " + valueB + " = " + result + "\n";
		System.out.println(msg);
		
	}
	
	/**
	 *  Launch Multiplication navigation
	 */
	public static void execMultiplication()	{
		
		float a = 0;
		float b = 0;
		
		System.out.println("a = ");
		a = SCAN.nextFloat();
		System.out.println("b = ");
		b = SCAN.nextFloat();
		
		Multiplication multi = new Multiplication(a);
		float result = multi.apply(b);
		
		System.out.println(String.valueOf(a) + " + " + String.valueOf(b) + " = " + String.valueOf(result));
	}
}
