package com.pluralsight.model.friendlyFaction;

import com.pluralsight.model.Weapon;

public class SupportSpecialist extends Helldiver{

    public SupportSpecialist(int hellDiverNumber, String helldiverName, String callsign, Weapon primaryWeapon, int specialty, int combatRating, int health, int stamina, int armorRating, boolean alive) {
        super(hellDiverNumber, helldiverName, callsign, primaryWeapon, specialty, combatRating, health, stamina, armorRating, alive);
    }

    public static void healAlly(){

    }

    public static void reviveSquadmate(){

    }
}
