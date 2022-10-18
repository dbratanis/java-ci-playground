
package com.db;

/**
 * HelloWorld Class
 */
public final class HelloWorld {

    /**
    * Main
    * @param args
    */
    public static void main(final String[] args) {

        var result = welcomeMessage("Welcome to FC");
        System.out.println(result);
    }


    /**
     * Concats input string with the Barcelona
     * @param text
     * @return
     */
    public static String welcomeMessage(String text) {
        return text + " Barcelona";
    }

}
