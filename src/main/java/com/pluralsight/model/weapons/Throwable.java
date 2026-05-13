package com.pluralsight.model.weapons;

public class Throwable extends Weapon{
    public Throwable(int damage, String penetrationLevel, String weaponName, WeaponType weaponType, double recoil) {
        super(damage, penetrationLevel, weaponName, weaponType, recoil);
    }
    private int explosiveRadius;
}
