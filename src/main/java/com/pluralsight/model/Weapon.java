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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getPenetrationLevel() {
        return penetrationLevel;
    }

    public void setPenetrationLevel(String penetrationLevel) {
        this.penetrationLevel = penetrationLevel;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public double getRecoil() {
        return recoil;
    }

    public void setRecoil(double recoil) {
        this.recoil = recoil;
    }

    public String getWeaponStats(){
        return
                getWeaponName()+"\n"+
                        "Weapon Type: " + weaponType + "\n" +
                        "Damage: " + damage + "\n" +
                        "Penetration: " + penetrationLevel + "\n" +
                        "Recoil Amount: " + recoil + "\n";
    }
}
