package com.akicalculator;

import com.akicalculator.utils.Navigation;

/**
 * Main Application class.
 */
public class Application {

    /**
     * Entry-point of application.
     * @param args arguments
     */
    @SuppressWarnings("PMD.AvoidInstantiatingObjectsInLoops")
    public static void main(final String[] args) {
        final Navigation navigation = new Navigation();
        while (true) {
            System.out.flush();
            navigation.printMenu();
            navigation.start();
        }
    }

}
