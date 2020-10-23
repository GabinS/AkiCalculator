package com.akicalculator.utils;

import java.util.Scanner;

import com.akicalculator.models.Addition;
import com.akicalculator.models.Division;
import com.akicalculator.models.History;
import com.akicalculator.models.Modulo;
import com.akicalculator.models.Multiplication;
import com.akicalculator.models.Power;
import com.akicalculator.models.SquareRoot;
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
     * History of operation
     */
    private final History history;

    /**
     * Default constructor
     */
    public Navigation() {
        this.history = History.getInstance();
    }

    /**
     * Display menu in console
     */
    public void printMenu() {
        System.out.println("----------------------------");
        System.out.println("|      AkiCalculator       |");
        System.out.println("| Operation:               |");
        System.out.println("|    [1] Addition          |");
        System.out.println("|    [2] Soustraction      |");
        System.out.println("|    [3] Multiplication    |");
        System.out.println("|    [4] Division          |");
        System.out.println("|    [5] Modulo            |");
        System.out.println("|    [6] Puissance         |");
        System.out.println("|    [7] Racine carree     |");
        System.out.println("|[H] Historique            |");
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
                    setInputValues("+");
                    break;
                case "2":
                    System.out.println("\nSoustraction");
                    validMenu = true;
                    setInputValues("-");
                    break;
                case "3":
                    System.out.println("\nMultiplication");
                    validMenu = true;
                    setInputValues("*");
                    break;
                case "4":
                    System.out.println("\nDivision");
                    validMenu = true;
                    setInputValues("/");
                    break;
                case "5":
                    System.out.println("\nModulo");
                    validMenu = true;
                    setInputValues("%");
                    break;
                case "6":
                    System.out.println("\nPuissance");
                    validMenu = true;
                    setInputValues("^");
                    break;
                case "7":
                    System.out.println("\nRacine carree");
                    validMenu = true;
                    setInputValue("V");
                    break;
                case "H":
                    System.out.println("\nHistorique ");
                    validMenu = true;
                    System.out.println(this.history.toString());
                    break;
                case "E":
                    System.out.println("\nVous avez quitte l'application !");
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
    public void execOperation(final String operator, final float valueA, final float valueB) {
        String resultOperation = "";
        switch (operator) {
            case "+":
                final Addition addition = new Addition(valueA, valueB);
                addition.apply();
                resultOperation = addition.getMessageOperation();
                break;
            case "-":
                final Subtraction subtraction = new Subtraction(valueA, valueB);
                subtraction.apply();
                resultOperation = subtraction.getMessageOperation();
                break;
            case "*":
                final Multiplication multiplication = new Multiplication(valueA, valueB);
                multiplication.apply();
                resultOperation = multiplication.getMessageOperation();
                break;
            case "/":
                if (0.0f != valueB) {
                    final Division division = new Division(valueA, valueB);
                    division.apply();
                    resultOperation = division.getMessageOperation();
                } else {
                    System.out.println("Impossible de faire une division par 0");
                }
                break;
            case "%":
                final Modulo modulo = new Modulo(valueA, valueB);
                modulo.apply();
                resultOperation = modulo.getMessageOperation();
                break;
            case "^":
                final Power power = new Power(valueA, valueB);
                power.apply();
                resultOperation = power.getMessageOperation();
                break;
            case "V":
                final SquareRoot squareRoot = new SquareRoot(valueA);
                squareRoot.apply();
                resultOperation = squareRoot.getMessageOperation();
                break;
            default:
                break;
        }
        if (0 != resultOperation.length()) {
            System.out.println(resultOperation);
            this.history.add(resultOperation);
        }
    }

    /**
     * Set input values.
     * @param operator the sign of the operator.
     */
    public void setInputValues(final String operator) {
        final float valueA = getValuekeyBoard("a");
        final float valueB = getValuekeyBoard("b");

        execOperation(operator, valueA, valueB);
    }

    /**
     * Set input values.
     * @param operator the sign of the operator.
     */
    public void setInputValue(final String operator) {
        final float valueA = getValuekeyBoard("a");
        execOperation(operator, valueA, 0);
    }


}
