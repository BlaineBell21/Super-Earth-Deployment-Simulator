package com.pluralsight.model.enemyFactions;



public class Terminid extends Enemy{

    private int swarmSize;
    private int movementSpeed;
    private int regenerationRate;
    private boolean enraged;
    private int mutationLevel;

    public Terminid(String name, int health, int damage, int armor, int threatLevel, boolean alive) {
        super(name, health, damage, armor, threatLevel, alive);
    }

    public static void regenerate(){

    }

    public static void enrage(){

    }

    public static void swarmAttack(){

    }
}
