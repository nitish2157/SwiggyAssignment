package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest {
    @Test
    public void PlayerCreation() {
        BasicPlayer player1 = PlayerFactory.createPlayer("A", 50, 5, 10);
        assertEquals("A", player1.getName());
        assertEquals(50, player1.getHealth());
        assertEquals(5, player1.getStrength());
        assertEquals(10, player1.getAttack());
    }

    @Test
    public void DiceRoll() {
        Dice dice = new BasicDice();
        int result = dice.roll();
        assertTrue(result >= 1 && result <= 6);
    }

    @Test
    public void ArenaBattle() {
        Player player1 = PlayerFactory.createPlayer("A", 50, 5, 10);
        Player player2 = PlayerFactory.createPlayer("B", 100, 10, 5);
        Dice dice = new BasicDice();
        Arena arena = new Arena(player1, player2, dice);

        arena.startBattle();

        assertTrue(player1.getHealth() == 0 || player2.getHealth() == 0); // Check that one player has died
    }
}

