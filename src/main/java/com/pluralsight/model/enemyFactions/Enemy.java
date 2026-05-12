package com.pluralsight.model.enemyFactions;

public class Enemy {
    private String name;
    private int health;
    private int damage;
    private int armor;
    private int threatLevel;
    private boolean alive;

    public Enemy(String name, int health, int damage, int armor, int threatLevel, boolean alive) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.threatLevel = threatLevel;
        this.alive = alive;
    }
}
