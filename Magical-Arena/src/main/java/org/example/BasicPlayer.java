package org.example;

public class BasicPlayer implements Player {
    private int health;
    private int strength;
    private int attack;
    private String name;

    public BasicPlayer(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void reduceHealth(int amount) {
        this.health -= amount;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getAttack() {
        return attack;
    }
}