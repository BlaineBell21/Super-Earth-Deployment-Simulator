package com.pluralsight.model.friendlyFaction;

import com.pluralsight.model.Weapon;

public class HeavyWeaponSpecialist extends Helldiver{
    private int explosivePower;
    private int recoilControl;
    private int armorPenetration;
    private int reloadTime;

    public HeavyWeaponSpecialist(int hellDiverNumber, String helldiverName, String callsign, Weapon primaryWeapon, int specialty, int combatRating, int health, int stamina, int armorRating, boolean alive) {
        super(hellDiverNumber, helldiverName, callsign, primaryWeapon, specialty, combatRating, health, stamina, armorRating, alive);
    }

    public static void suppresiveFire(){

    }
    public static void callHeavyStrike(){

    }
    public static void armorPiercingShort(){

    }
}
