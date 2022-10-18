/*
 *This is the HelloWorld Package
 */
package com.db;

public class HelloWorld {

	public static void main(String[] args) {

		var result = WelcomeMessage("Welcome to FC");
		System.out.println(result);
	}

	public static String WelcomeMessage(String text) {
		return text + " Barcelona";
	}

}
