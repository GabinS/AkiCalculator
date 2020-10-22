package com.akicalculator.utils;

import java.util.Scanner;

import com.akicalculator.models.Addition;
import com.akicalculator.models.Division;
import com.akicalculator.models.Multiplication;
import com.akicalculator.models.Subtraction;

/**
 * Navigation for menu
 */
public class Navigation {

    /**
     * Scanner to get keyboard informations
     */
    public static final Scanner SCAN = new Scanner(System.in);

    /**
     * Default constructor
     */
    public Navigation() { }

    /**
     * Display menu in console
     */
    public void printMenu() {
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
     * Start navigation
     */
    public void start() {
        Boolean validMenu = false;
        while (!validMenu) {
            System.out.print("Choix du menu : ");
            String menuSelected = SCAN.next();

            switch (menuSelected) {
                case "1":
                    System.out.println("\nAddition");
                    validMenu = true;
                    execOperation("+");
                    break;
                case "2":
                    System.out.println("\nSoustraction");
                    validMenu = true;
                    execOperation("-");
                    break;
                case "3":
                    System.out.println("\nMultiplication");
                    validMenu = true;
                    execOperation("*");
                    break;
                case "4":
                    System.out.println("\nDivision");
                    validMenu = true;
                    execOperation("/");
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
     * Get value by keyboard
     * @param letter is display for the value
     * @return value
     */
    public float getValuekeyBoard(String letter) {
        System.out.print(letter + " = ");
        final float value = SCAN.nextFloat();
        return value;
    }

    /**
     * Execute operation
     * @param operator sign of operation
     */
    public void execOperation(String operator) {
        final float valueA = getValuekeyBoard("a");
        final float valueB = getValuekeyBoard("b");

        switch (operator) {
            case "+":
                Addition addition = new Addition(valueA, valueB);
                addition.apply();
                addition.printMessageOperation();
                break;
            case "-":
                Subtraction subtraction = new Subtraction(valueA, valueB);
                subtraction.apply();
                subtraction.printMessageOperation();
                break;
            case "*":
                Multiplication multiplication = new Multiplication(valueA, valueB);
                multiplication.apply();
                multiplication.printMessageOperation();
                break;
            case "/":
                if (0.0f != valueB) {
                    System.out.println("Impossible de faire une division par 0");
                } else {
                    Division division = new Division(valueA, valueB);
                    division.apply();
                    division.printMessageOperation();
                }
                break;
            default:
                break;
        }
    }

}
