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
    private final transient History history;

    /**
     * History of operation
     */
    private transient float memory;

    /**
     * Default constructor
     */
    public Navigation() {
        this.history = History.getInstance();
        this.memory = 0;
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
        System.out.println("|[M] Memorisation valeur   |");
        System.out.println("|[H] Historique            |");
        System.out.println("|[Q] Quitter               |");
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
            validMenu = this.selectMenu(menuSelected);
        }
    }

    /**
     * Select Menu
     * @param menuSelected menu selection
     * @return true if menu selected is valid
     */
    public Boolean selectMenu(final String menuSelected) {
        switch (menuSelected) {
            case "1":
                System.out.println("\nAddition");
                setInputValues("+");
                break;
            case "2":
                System.out.println("\nSoustraction");
                setInputValues("-");
                break;
            case "3":
                System.out.println("\nMultiplication");
                setInputValues("*");
                break;
            case "4":
                System.out.println("\nDivision");
                setInputValues("/");
                break;
            case "5":
                System.out.println("\nModulo");
                setInputValues("%");
                break;
            case "6":
                System.out.println("\nPuissance");
                setInputValues("^");
                break;
            case "7":
                System.out.println("\nRacine carree");
                setInputValue("V");
                break;
            case "M":
                System.out.println("\nMemorisation valeur");
                System.out.println("Vous pourrez utiliser la touche M pour utiliser "
                        + "la valeur enregistree lors de vos prochains calcules");
                //this.saveValueMemory();
                break;
            case "H":
                System.out.println("\nHistorique ");
                System.out.println(this.history.toString());
                break;
            case "Q":
                System.out.println("\nVous avez quitte l'application !");
                System.exit(0);
                break;
            default:
                System.out.println("\nChoix du menu invalide !");
                return false;
        }
        return true;
    }

    /**
     * Get value by keyboard
     * @param letter is display for the value
     * @return value
     */
    public float getValuekeyBoard(final String letter) {
        System.out.print(letter + " = ");
        String valueStr = SCAN.next();
        float value = 0;
        if (valueStr.equals("M")) {
            value = this.memory;
        } else {
            valueStr = valueStr.replace(',', '.');
            value = Float.parseFloat(valueStr);
        }
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
                if (0 != valueB) {
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

    /**
     * Save memory value
     */
    public void saveValueMemory() {
        this.memory = getValuekeyBoard("M");
    }


}
