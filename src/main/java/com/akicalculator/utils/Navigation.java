package com.akicalculator.utils;

import java.util.Scanner;

import com.akicalculator.models.Addition;
import com.akicalculator.models.Division;
import com.akicalculator.models.Multiplication;
import com.akicalculator.models.Subtraction;
import com.akicalculator.models.Modulo;
import com.akicalculator.models.Puissance;
import com.akicalculator.models.SquareRoot;

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
    public Navigation() {}

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
        System.out.println("|    [5] Modulo            |");
        System.out.println("|    [6] Puissance         |");
        System.out.println("|    [7] Racine carrée     |");
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
            final String menuSelected = SCAN.next();

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
                    System.out.println("\nModulo");
                    validMenu = true;
                    execOperation("%");
                    break;
                case "6":
                    System.out.println("\nPuissance");
                    validMenu = true;
                    execOperation("^");
                    break;
                case "7":
                    System.out.println("\nRacine carrée");
                    validMenu = true;
                    execOperation("V");
                    break;
                case "E":
                    System.out.println("\nVous avez quitté l'application !");
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
    public float getValuekeyBoard(final String letter) {
        System.out.print(letter + " = ");
        final float value = SCAN.nextFloat();
        return value;
    }

    /**
     * Execute operation
     * @param operator sign of operation
     */
    public void execOperation(final String operator) {
        final float valueA = getValuekeyBoard("a");
        float valueB = 0.0f;

        if(operator != "V") {
           valueB = getValuekeyBoard("b");
        }

        switch (operator) {
            case "+":
                final Addition addition = new Addition(valueA, valueB);
                addition.apply();
                addition.printMessageOperation();
                break;
            case "-":
                final Subtraction subtraction = new Subtraction(valueA, valueB);
                subtraction.apply();
                subtraction.printMessageOperation();
                break;
            case "*":
                final Multiplication multiplication = new Multiplication(valueA, valueB);
                multiplication.apply();
                multiplication.printMessageOperation();
                break;
            case "/":
                if (0.0f != valueB) {
                    System.out.println("Impossible de faire une division par 0");
                } else {
                    final Division division = new Division(valueA, valueB);
                    division.apply();
                    division.printMessageOperation();
                }
                break;
            case "%":
                Modulo modulo = new Modulo(valueA, valueB);
                modulo.apply();
                modulo.printMessageOperation();
                break;
            case "^":
                Puissance puissance = new Puissance(valueA, valueB);
                puissance.apply();
                puissance.printMessageOperation();
                break;
            case "V":
                SquareRoot squareRoot = new SquareRoot(valueA);
                squareRoot.apply();
                squareRoot.printMessageOperation();
                break;
            default:
                break;
        }
    }

}
