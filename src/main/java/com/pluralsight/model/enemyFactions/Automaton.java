package com.pluralsight.model.enemyFactions;



public class Automaton extends Enemy{

    private String unitType;        // Devastator, Scout, Tank, etc.
    private int heatLevel;          // overheat mechanic
    private int accuracy;
    private int fireRate;
    private boolean overclocked;


    public Automaton(String name, int health, int damage, int armor, int threatLevel, boolean alive) {
        super(name, health, damage, armor, threatLevel, alive);
    }

    public static void overclockWeapons(){

    }
    public static void deploySuppressiveFire(){

    }
}