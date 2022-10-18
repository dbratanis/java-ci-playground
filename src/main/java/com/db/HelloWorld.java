
package com.db;

/**
 * HelloWorld Class.
 */
public final class HelloWorld {

    /**
     * Default constructor for HelloWorld.
     */
    private HelloWorld() {
    }

    /**
    * Main.
    * @param args
    */
    public static void main(final String[] args) {

        var result = welcomeMessage("Welcome to FC");
        System.out.println(result);
    }


    /**
     * Concats input string with the Barcelona.
     * @param text
     * @return A concatenate string
     */
    public static String welcomeMessage(final String text) {
        return text + " Barcelona";
    }

}
