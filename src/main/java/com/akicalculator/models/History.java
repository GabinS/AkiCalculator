package com.akicalculator.models;

import java.util.ArrayList;
import java.util.Collection;

/**
 * History class
 */
public class History {

    /**
     * Static instance
     */
    private static History instance;

    /**
     * List of history operation
     */
    private final Collection<String> list;

    /**
     * Default Constructor.
     */
    public History() {
        this.list = new ArrayList<String>();
    }

    /**
     * Get History instance
     * @return instance
     */
    public static History getInstance() {
        if (null == instance) {
            instance = new History();
        }
        return instance;
    }

    /**
     * Get list of history
     * @return the list of history
     */
    public Collection<String> getList() {
        return list;
    }

    /**
     * Add new line in history list
     * @param operation the operation
     */
    public void add(final String operation) {
        this.list.add(operation);
    }

    /**
     * Return list of history
     */
    @SuppressWarnings("PMD.DataflowAnomalyAnalysis")
    public String toString() {
        final StringBuilder history = new StringBuilder("");
        if (0 == this.list.size()) {
            history.append(" Aucun historique enregistré");
        } else {
            int lineNumber = 0;
            for (final String line : this.list) {
                history.append("[" + lineNumber + "] " + line);
                lineNumber++;
            }
        }

        return (String) history.toString();
    }

}
