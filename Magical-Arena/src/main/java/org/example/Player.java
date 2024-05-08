package org.example;

public interface Player {
    String getName();
    int getHealth();
    boolean isAlive();
    void reduceHealth(int amount);
    int getStrength();
    int getAttack();
}
