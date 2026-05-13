package com.pluralsight.model.players;

import com.pluralsight.model.weapons.Weapon;

public class ShockTrooper extends Helldiver{

    public ShockTrooper(String helldiverName, String callsign, Weapon primaryWeapon, Specialty specialty, int combatRating, int health, int stamina, int armorRating, boolean isAlive) {
        super(helldiverName, callsign, primaryWeapon, specialty, combatRating, health, stamina, armorRating, isAlive);
    }

    public static void activateOverdrive(){

    }

    public static void deployGrenade(){

    }

    @Override
    public String getStats(){
        String livingStatus;

        if (!isAlive()){
            livingStatus = "Honorably Dispatched";
        }
        livingStatus = "Alive";

        return
                getHelldiverName()+ "\n" +
                        "call sign\n" +
                        "Primary Weapon: " + getPrimaryWeapon().getWeaponName() + "\n" +
                        "Combat Rating: " + getCombatRating() + "\n" +
                        "Health: " + getHealth() + "\n" +
                        "Stamina: " + getStamina() + "\n" +
                        "Armor Rating: " + getArmorRating() + "\n" +
                        "Living Status: " + livingStatus;
    }
}
