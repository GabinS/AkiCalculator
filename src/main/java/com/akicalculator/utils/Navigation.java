package com.akicalculator.utils;

import java.util.Scanner;

import com.akicalculator.models.Addition;
import com.akicalculator.models.Division;
import com.akicalculator.models.Subtraction;
import com.akicalculator.models.Multiplication;

/**
 * Navigation for menu
 */
public class Navigation {

    /**
     * Scanner to get keyboard informations
     */
    public final Scanner SCAN = new Scanner(System.in);

    /**
     * Default constructor
     */
    public Navigation() { }

    /**
     * Display menu in console
     */
    public void printMenu () {
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
     * Launch Addition navigation
     */
    public void execAddition() {
        final float valueA = getValuekeyBoard("a");
        final float valueB = getValuekeyBoard("b");

        Addition add = new Addition(valueA, valueB);
        final float result = add.apply();

        getMessageOperation(valueA, valueB, result, "+");
    }

    /**
     * Launch Subtraction navigation.
     */
    public void execSubstraction() {
        final float valueA = getValuekeyBoard("a");
        final float valueB = getValuekeyBoard("b");

        Subtraction add = new Subtraction(valueA,valueB);
        final float result = add.apply();

        getMessageOperation(valueA, valueB, result, "+");
    }

    /**
     *  Launch Multiplication navigation
     */
    public void execMultiplication()	{
        final float valueA = getValuekeyBoard("a");
        final float valueB = getValuekeyBoard("b");

        Multiplication multi = new Multiplication(valueA, valueB);
        float result = multi.apply();

        getMessageOperation(valueA, valueB, result, "+");
    }

    /**
     *  Launch Division navigation
     */
    public void execDivision()	{
        final float valueA = getValuekeyBoard("a");
        final float valueB = getValuekeyBoard("b");

        Division division = new Division(valueA, valueB);
        float result = division.apply();

        getMessageOperation(valueA, valueB, result, "+");
    }
}
