package com.akicalculator.utils;

import java.util.Scanner;

import com.akicalculator.models.Addition;
import com.akicalculator.models.Division;
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
	    System.out.println("----------------------------");
	    System.out.println("|      AkiCalculator       |");
	    System.out.println("| Opération:               |");
	    System.out.println("|    [1] Addition          |");
	    System.out.println("|    [2] Soustraction      |");
	    System.out.println("|    [3] Multiplication    |");
	    System.out.println("|    [4] Division          |");
	    System.out.println("|[E] Exit                  |");
	    System.out.println("----------------------------");
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
				System.out.println("\nSoustraction");
			    validMenu = true;
				execSubstraction();
				break;
			case "3":
				System.out.println("\nMultiplication");
			    validMenu = true;
				execMultiplication();
				break;
			case "4":
				System.out.println("\nDivision");
			    validMenu = true;
				execDivision();
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
		final float valueA = SCAN.nextFloat();
		System.out.print("b = ");
		final float valueB = SCAN.nextFloat();
		
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
		final float valueA = SCAN.nextFloat();
		System.out.print("b = ");
		final float valueB = SCAN.nextFloat();
		
		Substraction add = new Substraction(valueA);
		final float result = add.apply(valueB);
		
		final String msg = valueA + " - " + valueB + " = " + result + "\n";
		System.out.println(msg);
		
	}
	
	/**
	 *  Launch Multiplication navigation
	 */
	public static void execMultiplication()	{
		System.out.print("a = ");
		final float valueA = SCAN.nextFloat();
		System.out.print("b = ");
		final float valueB = SCAN.nextFloat();
		
		Multiplication multi = new Multiplication(valueA);
		float result = multi.apply(valueB);

		final String msg = valueA + " x " + valueB + " = " + result + "\n";
		System.out.println(msg);
	}
	
	/**
	 *  Launch Division navigation
	 */
	public static void execDivision()	{
		System.out.print("a = ");
		final float valueA = SCAN.nextFloat();
		System.out.print("b = ");
		final float valueB = SCAN.nextFloat();

		Division division = new Division(valueA);
		float result = division.apply(valueB);

		final String msg = valueA + " / " + valueB + " = " + result + "\n";
		System.out.println(msg);
	}
}
