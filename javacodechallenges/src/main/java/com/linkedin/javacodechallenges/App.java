package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static final String numbers = "1234567890";

    public static boolean isPasswordComplex(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;

        if (password.length() > 5) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i)) && hasNumber != true) {
                    hasNumber = true;
                } else if (Character.isLowerCase(password.charAt(i)) && hasLowerCase != true) {
                    hasLowerCase = true;
                } else if (Character.isUpperCase(password.charAt(i)) && hasUpperCase != true) {
                    hasUpperCase = true;
                }
            }

            return hasNumber && hasLowerCase && hasUpperCase;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
