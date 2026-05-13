package com.pluralsight.model.friendlyFaction;

import com.pluralsight.model.Weapon;

public class Helldiver {
    //identity based stats
    private int hellDiverNumber;
    private String helldiverName;
    private String callsign;
    private Weapon primaryWeapon;
    private int specialty;

    //combat stats
    private int combatRating;
    private int health;
    private int stamina;
    private int armorRating;
    //current status
    private boolean isAlive;

    public Helldiver(int hellDiverNumber,
                     String helldiverName,
                     String callsign,
                     Weapon primaryWeapon,
                     int specialty,
                     int combatRating,
                     int health,
                     int stamina,
                     int armorRating,
                     boolean alive) {
        this.hellDiverNumber = hellDiverNumber;
        this.helldiverName = helldiverName;
        this.callsign = callsign;
        this.primaryWeapon = primaryWeapon;
        this.specialty = specialty;
        this.combatRating = combatRating;
        this.health = health;
        this.stamina = stamina;
        this.armorRating = armorRating;
        this.isAlive = alive;
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

    public void displayStats(){
        System.out.println("\n=== HELLDIVER STATUS ===");

        System.out.println("Callsign: " + callsign);
        System.out.println("Primary Weapon: " + primaryWeapon);
        System.out.println("Combat Rating: " + combatRating);
        System.out.println("Health: " + health);
        System.out.println("Stamina: " + stamina);
        System.out.println("Armor Rating: " + armorRating);

        System.out.println("Life status: " + isAlive);
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

    public void setCombatRating(int combatRating) {
        this.combatRating = combatRating;
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

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String getHelldiverName() {
        return helldiverName;
    }

    public void setHelldiverName(String helldiverName) {
        this.helldiverName = helldiverName;
    }

    public int getSpecialty() {
        return specialty;
    }

    public void setSpecialty(int specialty) {
        this.specialty = specialty;
    }

    public int getArmorRating() {
        return armorRating;
    }

    public String getStats(){
        return
                getHelldiverName()+"\n"+
                "call sign\n" +
                "Primary Weapon: " + primaryWeapon.getWeaponName() + "\n" +
                "Helldiver Specialty" + specialty + "\n" +
                "Combat Rating: " + 100 + "\n" +
                "Health: " + 100+ "\n" +
                "Stamina: " + 100+ "\n" +
                "Armor Rating: " + 100+ "\n" +
                true;
    }

    public void setArmorRating(int armorRating) {
        this.armorRating = armorRating;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        this.isAlive = alive;
    }
}