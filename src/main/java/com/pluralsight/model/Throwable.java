package com.pluralsight.model;

public class Throwable extends Weapon{
    public Throwable(int damage, String penetrationLevel, String weaponName, String weaponType, double recoil) {
        super(damage, penetrationLevel, weaponName, weaponType, recoil);
    }
    private int explosiveRadius;
}
