package com.pluralsight.model;

public class Weapon {
    private int damage;
    private String penetrationLevel;
    private String weaponName;
    private String weaponType;
    private double recoil;

    public Weapon(int damage, String penetrationLevel, String weaponName, String weaponType, double recoil) {
        this.damage = damage;
        this.penetrationLevel = penetrationLevel;
        this.weaponName = weaponName;
        this.weaponType = weaponType;
        this.recoil = recoil;
    }
}
