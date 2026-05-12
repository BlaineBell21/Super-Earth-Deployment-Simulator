package com.pluralsight.model.friendlyFaction;

public class ReconOperative extends Helldiver{
    private int accuracy;
    private int stealth;
    private int detectionRange;
    private boolean markedTargets;

    public ReconOperative(int hellDiverNumber, String helldiverName, String callsign, String primaryWeapon, int specialty, int combatRating, int health, int stamina, int armorRating, boolean alive) {
        super(hellDiverNumber, helldiverName, callsign, primaryWeapon, specialty, combatRating, health, stamina, armorRating, alive);
    }

    public static void markTarget(){

    }
    public static void scanArea(){

    }
    public static void precisionShot(){

    }
}
