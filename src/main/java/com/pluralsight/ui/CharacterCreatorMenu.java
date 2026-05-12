package com.pluralsight.ui;

import com.pluralsight.model.friendlyFaction.Helldiver;
import com.pluralsight.utils.UserInput;

import java.util.ArrayList;

public class CharacterCreatorMenu {
    private static ArrayList<Helldiver> players = new ArrayList<>();

    public static void amountOfPlayersUI(){
        System.out.println("How many divers are being enrolled in training?");
        System.out.println("Enter a number between 1 and 4: ");
    }

    public static int collectAmountOfPlayers(){
        amountOfPlayersUI();
        while (true){

            int amountOfPlayers = UserInput.userIntInput();

            if (amountOfPlayers > 0 && amountOfPlayers <= 4){
                System.out.println("collected " + amountOfPlayers);
                return amountOfPlayers;

            }
            System.out.println("Amount of new recruits must be between 1 and 4.");
            System.out.println("Try again: ");
        }
    }
    public static void chooseYourSpecialtyUI(){
        System.out.println("Choose one of 4 specialties: ");
        System.out.println("1) Heavy Weapons Specialist");
        System.out.println("2) Recon Operative");
        System.out.println("3) Shock Trooper");
        System.out.println("4) Support Specialist");
    }
    public static int collectSpecialty(){
        while (true){

            int playerSpecialty = UserInput.userIntInput();

            if (playerSpecialty > 0 && playerSpecialty <= 4){
                System.out.println("collected " + playerSpecialty);
                return playerSpecialty;

            }
            System.out.println("Amount of new recruits must be between 1 and 4.");
            System.out.println("Try again: ");
        }
    }


    public static void helldiverCreator(){
        int amountOfPlayers = collectAmountOfPlayers();

        while (amountOfPlayers > 0) {
            System.out.println("Enter in your name: ");
            String playerName = UserInput.userStringInput();

            System.out.println("Choose your callsigns");


            System.out.println("Choose a primary weapon: ");
            String primaryWeapon = UserInput.userStringInput();

            int specialty = collectSpecialty();;
            amountOfPlayers -= 1;

            Helldiver newHelldiver = new Helldiver(0,
                    playerName,
                    "",
                    primaryWeapon,
                    specialty,
                    100,
                    100,
                    100,
                    100,
                    true);
        }
        System.out.println("finished character creation");
    }
}

