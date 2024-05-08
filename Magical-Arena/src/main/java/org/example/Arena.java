package org.example;

public class Arena {
    private Player player1;
    private Player player2;
    private Dice dice;
    private Player currentAttacker;
    private Player currentDefender;

    public Arena(Player player1, Player player2, Dice dice) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = dice;

        if (player1.getHealth() < player2.getHealth()) {
            currentAttacker = player1;
            currentDefender = player2;
        } else {
            currentAttacker = player2;
            currentDefender = player1;
        }
    }

    public void startBattle() {
        while (player1.isAlive() && player2.isAlive()) {
            int attackRoll = dice.roll();
            int defendRoll = dice.roll();

            int attackDamage = currentAttacker.getAttack() * attackRoll;
            int defenseValue = currentDefender.getStrength() * defendRoll;

            int netDamage = attackDamage - defenseValue;

            if (netDamage > 0) {
                currentDefender.reduceHealth(netDamage);
            }

            System.out.printf("%s attacks %s, attack roll: %d, defense roll: %d, damage dealt: %d, %s's health: %d%n",
                    currentAttacker.getName(), currentDefender.getName(), attackRoll, defendRoll, netDamage,
                    currentDefender.getName(), currentDefender.getHealth());

            switchRoles();
        }

        System.out.printf("Game over. Winner is %s%n", getWinner().getName());
    }

    private void switchRoles() {
        Player temp = currentAttacker;
        currentAttacker = currentDefender;
        currentDefender = temp;
    }

    private Player getWinner() {
        return player1.isAlive() ? player1 : player2;
    }
}

