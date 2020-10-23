package com.akicalculator;

import com.akicalculator.utils.Navigation;

/**
 * Main Application class.
 */
public class Application {

    /**
     * Entry-point of application.
     */
    public static void main(final String[] args) {
        while (true) {
            System.out.flush();
            final Navigation navigation = new Navigation();
            navigation.printMenu();
            navigation.start();
        }
    }

}
