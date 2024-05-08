package org.example;

public class Main {
    public static void main(String[] args) {
        // Create players using the PlayerFactory
        Player player1 = PlayerFactory.createPlayer("Player A", 50, 5, 10);
        Player player2 = PlayerFactory.createPlayer("Player B", 100, 10, 5);
        Dice dice = new BasicDice();

        // Create an arena and start the battle
        Arena arena = new Arena(player1, player2, dice);
        arena.startBattle();
    }
}