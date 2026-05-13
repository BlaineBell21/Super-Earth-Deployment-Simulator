package com.pluralsight.model.players;

import com.pluralsight.model.weapons.Weapon;

public class ReconOperative extends Helldiver{
    private int accuracy;
    private int stealth;
    private int detectionRange;
    private boolean markedTargets;

    public ReconOperative(String helldiverName, String callsign, Weapon primaryWeapon, Specialty specialty, int combatRating, int health, int stamina, int armorRating, boolean isAlive) {
        super(helldiverName, callsign, primaryWeapon, specialty, combatRating, health, stamina, armorRating, isAlive);
    }

    public static void markTarget(){

    }
    public static void scanArea(){

    }
    public static void precisionShot(){

    }

    @Override
    public String getStats(){
        String livingStatus;

        if (!isAlive()){
            livingStatus = "Honorably Dispatched";
        }
        livingStatus = "Alive";

        return
                getHelldiverName() + "\n" +
                        "call sign\n" +
                        "Primary Weapon: " + getPrimaryWeapon().getWeaponName() + "\n" +
                        "Combat Rating: " + getCombatRating() + "\n" +
                        "Health: " + getHealth() + "\n" +
                        "Stamina: " + getStamina() + "\n" +
                        "Armor Rating: " + getArmorRating() + "\n" +
                        "Living Status: " + livingStatus;
    }
}
