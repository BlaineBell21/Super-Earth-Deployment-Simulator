package com.pluralsight.service;

import com.pluralsight.model.weapons.Weapon;
import com.pluralsight.model.weapons.WeaponType;
import com.pluralsight.utils.UserInput;

import java.io.IOException;
import java.util.ArrayList;

public class WeaponService {
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
        System.out.println("9) Energy Based");
    }

    public static Weapon weaponChoices(ArrayList<Weapon> weapons) throws IOException {

        while (true){
            weaponChoiceUI();
            WeaponType weaponType;
            String option = UserInput.userStringInput();
            switch(option){
                case "1":
                    weaponType = WeaponType.ASSAULT_RIFLE;
                    System.out.println("Showing Assault Rifle Inventory");
                    return weaponSorter(weaponType, weapons);
                case "2":
                    weaponType = WeaponType.MARKSMAN_RIFLE;
                    System.out.println("Showing Marksman Rifle Inventory");
                    return weaponSorter(weaponType, weapons);
                case "3":
                    weaponType = WeaponType.SHOTGUN;
                    System.out.println("Showing Shotgun Inventory");
                    return weaponSorter(weaponType, weapons);
                case "4":
                    weaponType = WeaponType.SUBMACHINE_GUN;
                    System.out.println("Showing Submachine Gun Inventory");
                    return weaponSorter(weaponType, weapons);
                case "5":
                    weaponType = WeaponType.EXPLOSIVE;
                    System.out.println("Showing Explosive Inventory");
                    return weaponSorter(weaponType, weapons);
                case "6":
                    weaponType = WeaponType.PISTOL;
                    System.out.println("Showing Pistol Inventory");
                    return weaponSorter(weaponType, weapons);
                case "7":
                    weaponType = WeaponType.MELEE;
                    System.out.println("Showing Melee Inventory");
                    return weaponSorter(weaponType, weapons);
                case "8":
                    weaponType = WeaponType.SPECIAL;
                    System.out.println("Showing Special Inventory");
                    return weaponSorter(weaponType, weapons);
                case "9":
                    weaponType = WeaponType.ENERGY_BASED;
                    System.out.println("Showing Energy Based Inventory");
                    return weaponSorter(weaponType, weapons);
                default:
                    System.out.println("Incorrect Input. Try Again.");
            }
        }
    }

    public static void listOfWeaponType(ArrayList<Weapon> chosenType, WeaponType weaponType, ArrayList<Weapon> weapons) throws IOException {

        for(Weapon weapon : weapons){

            if(weapon.getWeaponType() == weaponType){
                chosenType.add(weapon);
                System.out.println(weapon.getWeaponStats());
            }
        }
    }

    public static ArrayList<Weapon> weaponMatching(WeaponType weaponType, ArrayList<Weapon> weapons) throws IOException {
        ArrayList<Weapon> matchingWeapons = new ArrayList<>(); //in case there are multiple weapons with similar names, allows user to pick from a list

        ArrayList<Weapon> chosenType = new ArrayList<>();// puts all weapons of that particular type into a list to choose from

        while (true) {
            listOfWeaponType(chosenType, weaponType, weapons);

            String chosenWeapon = UserInput.userStringInput().trim().replace(" ", "").toLowerCase();
            System.out.println("next step");
            for (Weapon weapon : chosenType) {
                System.out.println("Weapon matching for loop");

                if (weapon.getWeaponName().toLowerCase().equals(chosenWeapon) || weapon.getWeaponName().toLowerCase().contains(chosenWeapon)) {
                    System.out.println("matching weapon types");
                    matchingWeapons.add(weapon);
                    System.out.println("added it to add matches");
                    return matchingWeapons;
                } else {
                    System.out.println("No matches found.");
                }
            }
        }
    }

    public static Weapon weaponSorter(WeaponType weaponType, ArrayList<Weapon> weapons) throws IOException {


        ArrayList<Weapon> matchingWeapons = weaponMatching(weaponType, weapons);

        if (matchingWeapons.size() == 1){
            System.out.println("one match");
            return matchingWeapons.get(0);
        } else if (matchingWeapons.size() > 1) {
            System.out.println("more than one match");
        }
        return null;
    }
}
