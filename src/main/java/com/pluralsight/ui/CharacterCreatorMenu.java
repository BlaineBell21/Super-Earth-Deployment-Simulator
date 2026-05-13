package com.pluralsight.ui;

import com.pluralsight.model.players.*;
import com.pluralsight.model.weapons.Weapon;
import com.pluralsight.utils.UserInput;

import java.io.IOException;
import java.util.ArrayList;

import static com.pluralsight.service.WeaponService.weaponChoices;
import static com.pluralsight.utils.helpers.SelectionConfirmation.confirmSelection;

public class CharacterCreatorMenu {
    private static final ArrayList<Helldiver> players = new ArrayList<>();

    public static void helldiverCreator(ArrayList<Weapon> weapons) throws IOException {
        amountOfPlayersUI();
        int amountOfPlayers = collectNumber();

        while (amountOfPlayers > 0) {
            System.out.println("Enter in your name: ");
            String playerName = UserInput.userStringInput();
            System.out.println("Choose your call signs");

             Weapon primaryWeapon = weaponChoices(weapons);

            amountOfPlayers -= 1;

            chooseYourSpecialtyOptions(playerName, primaryWeapon);

        }
        System.out.println("finished character creation");
    }

    public static void chooseYourSpecialtyUI(){
        System.out.println("Enter in the number of one of the 4 specialties: ");
        System.out.println("1) Heavy Weapons Specialist");
        System.out.println("2) Recon Operative");
        System.out.println("3) Shock Trooper");
        System.out.println("4) Support Specialist");
    }

    public static void amountOfPlayersUI(){
        System.out.println("How many divers are being enrolled in training?");
        System.out.println("Enter a number between 1 and 4: ");
    }

    public static boolean roleAlreadyChosen(Specialty specialty){
        for (Helldiver player : players){
            if(player.getSpecialty() == specialty){
                System.out.println("You must choose a role that isn't already chosen.");
                return false;
            }
        }
        return true;
    }

    public static void playerCreator(Specialty role,String playerName, Weapon primaryWeapon){
        switch (role){
            case HEAVY_WEAPONS_SPECIALIST -> {
            HeavyWeaponSpecialist heavyWeapons = new HeavyWeaponSpecialist(
                    playerName,
                    "",
                    primaryWeapon,
                    Specialty.HEAVY_WEAPONS_SPECIALIST,
                    Specialty.HEAVY_WEAPONS_SPECIALIST.getCombatBonus(),
                    100,
                    100,
                    100,
                    true);
            System.out.println(heavyWeapons.getStats());
            players.add(heavyWeapons);
            }
            case RECON_OPERATIVE -> {
                ReconOperative reconOp = new ReconOperative(
                        playerName,
                        "",
                        primaryWeapon,
                        Specialty.RECON_OPERATIVE,
                        Specialty.RECON_OPERATIVE.getCombatBonus(),
                        100,
                        100,
                        100,
                        true);
                System.out.println(reconOp.getStats());
                players.add(reconOp);
            }
            case SHOCK_TROOPER -> {
                ShockTrooper shockTrooper = new ShockTrooper(
                        playerName,
                        "",
                        primaryWeapon,
                        Specialty.SHOCK_TROOPER,
                        Specialty.SHOCK_TROOPER.getCombatBonus(),
                        100,
                        100,
                        100,
                        true);
                System.out.println(shockTrooper.getStats());
                players.add(shockTrooper);
            }
            case SUPPORT_SPECIALIST -> {
                SupportSpecialist supportSpecialist = new SupportSpecialist(
                        playerName,
                        "",
                        primaryWeapon,
                        Specialty.SUPPORT_SPECIALIST,
                        Specialty.SUPPORT_SPECIALIST.getCombatBonus(),
                        100,
                        100,
                        100,
                        true);
                System.out.println(supportSpecialist.getStats());
                players.add(supportSpecialist);
            }
        }
    }

    public static boolean roleValidation(Specialty specialty){
        return !roleAlreadyChosen(specialty);
    }

    public static void chooseYourSpecialtyOptions(String playerName, Weapon primaryWeapon){

        boolean isDoneChoosing = false;
        System.out.println("made it to specialty");
        while(!isDoneChoosing) {

        System.out.println("made it to player loop");
        chooseYourSpecialtyUI();
        Specialty specialty;
        String option = UserInput.userStringInput();
        switch (option) {
            case "1":
                 specialty = Specialty.HEAVY_WEAPONS_SPECIALIST;

                if(!roleValidation(specialty)){
                    System.out.println("made it to role validation");
                    if(confirmSelection()) {
                        playerCreator(specialty, playerName, primaryWeapon);
                        isDoneChoosing = true;
                    } else {
                        break;
                    }
                }
                break;
            case "2":
                 specialty = Specialty.RECON_OPERATIVE;

                if(!roleValidation(specialty)){
                    System.out.println("made it to role validation");
                    if(confirmSelection()) {
                        playerCreator(specialty, playerName, primaryWeapon);
                        isDoneChoosing = true;
                    } else {
                        break;
                    }
                }
                break;
            case "3":
                specialty = Specialty.SHOCK_TROOPER;

                if(!roleValidation(specialty)){
                    System.out.println("made it to role validation");
                    if(confirmSelection()) {
                        playerCreator(specialty, playerName, primaryWeapon);
                        isDoneChoosing = true;
                    } else {
                        break;
                    }
                }
                break;
            case "4":
                specialty = Specialty.SUPPORT_SPECIALIST;

                if(!roleValidation(specialty)){
                    System.out.println("made it to role validation");
                    if(confirmSelection()) {
                        playerCreator(specialty, playerName, primaryWeapon);
                        isDoneChoosing = true;
                    } else {
                        break;
                    }
                }
                break;
            default:
                System.out.println("Incorrect input. Try Again. specialty menu");
            }
        }
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

}

