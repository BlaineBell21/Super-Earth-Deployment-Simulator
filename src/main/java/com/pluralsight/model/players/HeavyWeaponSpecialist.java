package com.pluralsight.model.players;

import com.pluralsight.model.weapons.Weapon;

public class HeavyWeaponSpecialist extends Helldiver{
    private int explosivePower;
    private int recoilControl;
    private int armorPenetration;
    private int reloadTime;

    public HeavyWeaponSpecialist(String helldiverName, String callsign, Weapon primaryWeapon, Specialty specialty, int combatRating, int health, int stamina, int armorRating, boolean isAlive) {
        super(helldiverName, callsign, primaryWeapon, specialty, combatRating, health, stamina, armorRating, isAlive);
    }

    public static void suppresiveFire(){

    }
    public static void callHeavyStrike(){

    }
    public static void armorPiercingShort(){

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
