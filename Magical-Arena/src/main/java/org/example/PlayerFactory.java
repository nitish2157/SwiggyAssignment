package org.example;

public class PlayerFactory {
    public static BasicPlayer createPlayer(String name, int health, int strength, int attack) {
        return new BasicPlayer(name, health, strength, attack);
    }
}
