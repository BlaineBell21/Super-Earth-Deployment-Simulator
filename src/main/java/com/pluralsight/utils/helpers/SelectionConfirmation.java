package com.pluralsight.utils.helpers;

import com.pluralsight.utils.UserInput;

public class SelectionConfirmation {
    public static boolean confirmSelection(){
        while (true){
            System.out.println("Would you like to confirm your selection? (yes/no): ");
            String option = UserInput.userStringInput();
            switch (option){
                case "yes":
                    return true;
                case "no":
                    System.out.println("Returning to options.");
                    return false;
                default:
                    System.out.println("Invalid input. Try again.");
            }
        }
    }
}
