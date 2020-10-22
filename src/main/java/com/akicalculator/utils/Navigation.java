package com.akicalculator.utils;

import java.util.Scanner;

import com.akicalculator.models.Addition;
import com.akicalculator.models.Division;
import com.akicalculator.models.Multiplication;
import com.akicalculator.models.Puissance;
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
        System.out.println("|    [5] Puissance         |");
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
                case "5":
                    System.out.println("\nPuissance");
                    validMenu = true;
                    execOperation("^");
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
     * Display operation in console
     * @param valueA first value
     * @param valueB second value
     * @param result of operation
     * @param operator type operator
     */
    public void getMessageOperation(float valueA, float valueB, float result, String operator) {
        final String msg = valueA + " " + operator + " " + valueB + " = " + result + "\n";
        System.out.println(msg);
    }

    /**
     * Execute operation
     * @param operator sign of operation
     */
    public void execOperation(String operator) {
        final float valueA = getValuekeyBoard("a");
        final float valueB = getValuekeyBoard("b");
        float result = 0;

        switch (operator) {
            case "+":
                Addition add = new Addition(valueA, valueB);
                result = add.apply();
                break;
            case "-":
                Subtraction subtraction = new Subtraction(valueA, valueB);
                result = subtraction.apply();
                break;
            case "*":
                Multiplication multiplication = new Multiplication(valueA, valueB);
                result = multiplication.apply();
                break;
            case "/":
                Division division = new Division(valueA, valueB);
                result = division.apply();
                break;
            case "^":
                Puissance puissance = new Puissance(valueA, valueB);
                result = puissance.apply();
                break;
            default:
                break;
        }
        getMessageOperation(valueA, valueB, result, operator);
    }

}
