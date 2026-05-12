package com.pluralsight.utils;

import java.util.Scanner;

public class UserInput {
    private static Scanner userInput = new Scanner(System.in);

    public static String userStringInput(){
        String input = userInput.nextLine();
        return input;
    }

    public static int userIntInput(){
        int input = userInput.nextInt();
        userInput.nextLine(); // clear newline buffer
        return input;
    }
}
