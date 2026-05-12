package com.pluralsight.ui;


import com.pluralsight.utils.UserInput;

public class MainMenu {
    public void menuUI(){
        System.out.println("Welcome to the DBZ Battle Arena");
    }
    public static void mainMenuUI(){
        System.out.println("=== HELLDIVER DEPLOYMENT SIMULATOR v1.0 ===\n" +
                "\n" +
                "Status: RECRUIT ACTIVATED\n" +
                "\n" +
                "Training Record: NOT FOUND\n" +
                "Survival Probability: \"Optimistic\"\n" +
                "Previous Combat Experience: IRRELEVANT\n" +
                "\n" +
                "Reminder:\n" +
                "You are replaceable.\n" +
                "You are expendable.\n" +
                "You are DEMOCRACY’S BEST OPTION.");

    }
    public static void mainMenuOptions(){

        boolean isChoosing = false;

        while(!isChoosing){
            mainMenuUI();
            switch(UserInput.userStringInput()){
                case "1":
                    System.out.println("Start Simulation");
                    break;
                case "2":
                    System.out.println("View Enemy Forces");
                    break;
                case "3":
                    System.out.println("Calculate Total Threat Level");
                    break;
                case "4":
                    System.out.println("Start Invasion");
                    break;
                case "5":
                    System.out.println("Save Combat Report");
                    break;
                case "6":
                    System.out.println("Display stats");
                    break;
                case "0":
                    System.out.println("Exit Simulation");
                    break;
                default:
                    System.out.println("Invalid Option. Try Again.");
            }
        }
    }
}
