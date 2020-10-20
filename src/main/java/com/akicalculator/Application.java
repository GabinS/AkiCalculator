package com.akicalculator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        while (true) {
        	System.out.flush();
        	printMenu();
            selectMenu();
		}
    } 
    
    /**
	 * Display menu in console
	 */
	public static void printMenu () {
	    System.out.println("|      AkiCalculator       |");
	    System.out.println("| Opération:               |");
	    System.out.println("|    [1] opération 1       |");
	    System.out.println("|[E] Exit                  |");
	}
	
	
	/**
	 * 
	 */
	public static void selectMenu() {
		Scanner scan = new Scanner(System.in);
		String menuSelected = null;
		Boolean validMenu = false;
		while(!validMenu) {
		    System.out.println("Choix du menu : ");
		    menuSelected = scan.nextLine();
		    validMenu = true;
		    
		    switch (menuSelected) {
			case "1":
			    System.out.println("opération 1 sélectionné");
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

}
