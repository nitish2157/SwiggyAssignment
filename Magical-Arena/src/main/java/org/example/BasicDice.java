package org.example;

import org.example.Dice;

import java.util.Random;

public class BasicDice implements Dice {
    private static final int DEFAULT_SIDES = 6;
    private Random random;
    private int sides;

    public BasicDice(int sides) {
        if (sides <= 0) {
            throw new IllegalArgumentException("Number of sides must be positive");
        }
        this.sides = sides;
        this.random = new Random();
    }

    public BasicDice() {
        this(DEFAULT_SIDES);
    }

    @Override
    public int roll() {
        return random.nextInt(sides) + 1; // Returns a value between 1 and 'sides'
    }
}