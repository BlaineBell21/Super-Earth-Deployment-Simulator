package com.pluralsight.model.players;

import com.pluralsight.model.weapons.Weapon;

public abstract class Helldiver {
    //identity based stats
    private String helldiverName;
    private String callsign;
    private Weapon primaryWeapon;
    private Specialty specialty;

    //combat stats
    private int combatRating;
    private int health;
    private int stamina;
    private int armorRating;
    //current status
    private boolean isAlive;

    public Helldiver(String helldiverName,
                     String callsign,
                     Weapon primaryWeapon,
                     Specialty specialty,
                     int combatRating,
                     int health,
                     int stamina,
                     int armorRating,
                     boolean isAlive) {
        this.helldiverName = helldiverName;
        this.callsign = callsign;
        this.primaryWeapon = primaryWeapon;
        this.specialty = specialty;
        this.combatRating = combatRating;
        this.health = health;
        this.stamina = stamina;
        this.armorRating = armorRating;
        this.isAlive = isAlive;
    }

    public void attack() {
        System.out.println("\n=== ATTACK INITIATED ===");
        System.out.println(callsign + " fires their " + primaryWeapon + "!");
        System.out.println("Combat Rating: " + combatRating);
    }

    public void takeDamage(){

    }

    public void userStim(){

    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }


    public Weapon getPrimaryWeapon() {
        return primaryWeapon;
    }

    public void setPrimaryWeapon(Weapon primaryWeapon) {
        this.primaryWeapon = primaryWeapon;
    }

    public int getCombatRating() {
        return combatRating;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }


    public String getHelldiverName() {
        return helldiverName;
    }

    public Specialty getSpecialty() {
        return specialty;
    }


    public int getArmorRating() {
        return armorRating;
    }

    public abstract String getStats();


    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        this.isAlive = alive;
    }
}