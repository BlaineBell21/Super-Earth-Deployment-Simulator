package com.pluralsight.model.enemyFactions;

public class Illuminate extends Enemy{

    private int shieldStrength;
    private int energyPool;
    private boolean cloaked;
    private int psionicPower;
    private int teleportCooldown;

    public Illuminate(String name, int health, int damage, int armor, int threatLevel, boolean alive) {
        super(name, health, damage, armor, threatLevel, alive);
    }

    public static void activateShield(){

    }

    public static void teleport(){

    }

    public static void mindBlast(){

    }
}
