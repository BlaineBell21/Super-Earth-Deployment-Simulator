package com.pluralsight.ui;

import com.pluralsight.model.Weapon;
import com.pluralsight.model.friendlyFaction.Helldiver;
import com.pluralsight.utils.InputReader;
import com.pluralsight.utils.UserInput;

import java.io.IOException;
import java.util.ArrayList;

public class CharacterCreatorMenu {
    private static ArrayList<Helldiver> players = new ArrayList<>();
    public static void helldiverCreator(InputReader weapons) throws IOException {
        amountOfPlayersUI();
        int amountOfPlayers = collectNumber();

        while (amountOfPlayers > 0) {
            System.out.println("Enter in your name: ");
            String playerName = UserInput.userStringInput();

            System.out.println("Choose your call signs");


             Weapon primaryWeapon = weaponChoices(weapons);

//            int specialty = collectNumber();
            int specialty = 1;
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
            System.out.println(newHelldiver.getStats());
            players.add(newHelldiver);
        }
        System.out.println("finished character creation");
    }

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
    public static int collectNumber(){
        while (true){

            int playerSpecialty = UserInput.userIntInput();

            if (playerSpecialty > 0 && playerSpecialty <= 4){
                System.out.println("collected " + playerSpecialty);
                return playerSpecialty;

            }
            System.out.println("Must be between 1 and 4.");
            System.out.println("Try again: ");
        }
    }


    public static void weaponChoiceUI(){
        System.out.println("Choose a primary: ");
        System.out.println("1) Assault Rifle");
        System.out.println("2) Marksman Rifle");
        System.out.println("3) Shotgun");
        System.out.println("4) Submachine Gun");
        System.out.println("5) Explosive");
        System.out.println("6) Pistol");
        System.out.println("7) Melee");
        System.out.println("8) Special");
    }

    public static Weapon weaponChoices(InputReader weapons) throws IOException {

        while (true){
            weaponChoiceUI();
            String weaponType = "";
            int option = UserInput.userIntInput();
            switch(option){
                case 1:
                     weaponType = "Assault Rifle";
                    System.out.println("Showing Assault Rifle Inventory");
                   return weaponSorter(weaponType);
                case 2:
                     weaponType = "Marksman Rifle";
                    System.out.println("Showing Marksman Rifle Inventory");
                    weaponSorter(weaponType);
                    return weaponSorter(weaponType);
                case 3:
                     weaponType = "Shotgun";
                    System.out.println("Showing Shotgun Inventory");
                    return weaponSorter(weaponType);
                case 4:
                     weaponType = "Submachine Gun";
                    System.out.println("Showing Submachine Gun Inventory");
                    return weaponSorter(weaponType);
                case 5:
                    weaponType = "Explosive";
                    System.out.println("Showing Explosive Inventory");
                    return weaponSorter(weaponType);
                case 6:
                   weaponType = "Pistol";
                    System.out.println("Showing Pistol Inventory");
                    return weaponSorter(weaponType);
                case 7:
                    weaponType = "Melee";
                    System.out.println("Showing Melee Inventory");
                    return weaponSorter(weaponType);
                case 8:
                    weaponType = "Special";
                    System.out.println("Showing Special Inventory");
                    return weaponSorter(weaponType);
                default:
                    System.out.println("Incorrect Input. Try Again.");
            }
        }
    }
    public static Weapon weaponSorter(String weaponType) throws IOException {

        ArrayList<Weapon> weapons = InputReader.weaponReader();
        ArrayList<Weapon> chosenType = new ArrayList<>();

        for(Weapon weapon : weapons){
            if(weapon.getWeaponType().equals(weaponType)){
                chosenType.add(weapon);
                System.out.println(weapon.getWeaponStats());
            }
        }
        boolean isDoneChoosing = false;

        while (!isDoneChoosing) {
            String chosenWeapon = UserInput.userStringInput();
            String formattedChosenWeapon = chosenWeapon.replace(" ", "").toLowerCase();

            for (Weapon weapon : chosenType) {
                if (weapon.getWeaponName().toLowerCase().equals(formattedChosenWeapon) || weapon.getWeaponName().toLowerCase().contains(formattedChosenWeapon)) {

                    return weapon;
                }
            }
        }
        return null;
    }

}

