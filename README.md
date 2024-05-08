# Magical Arena Assignment for Swiggy

# Arena Battle Simulator

## Overview
The Arena Battle Simulator is a Java application that simulates battles between two players in an arena. It allows us to create players with customizable attributes such as health, strength, and attack, and then pits them against each other using dice rolls to determine the outcome of each attack.

## Features
Create customizable players with different attributes.
Simulate battles between two players in an arena setting.
Use dice rolls to determine attack and defense outcomes.
Determine the winner of each battle based on the players' health.
## Installation
To use the Arena Battle Simulator, follow these steps:

Ensure we have Java installed on your system.
Clone or download the project files from the GitHub repository.
Open the project in our preferred Java IDE.
Compile and run the Main class to start the simulation.
## Usage
### Creating Players
Players can be created using the PlayerFactory class or by directly instantiating the Player class. Use the PlayerFactory.createPlayer() method to create players with specified attributes:

`Player player1 = PlayerFactory.createPlayer("Player A", 50, 5, 10);`

`Player player2 = PlayerFactory.createPlayer("Player B", 100, 10, 5);`

#### Starting a Battle
To start a battle between two players, create an instance of the Arena class with the players and call the startBattle() method:

`Arena arena = new Arena(player1, player2, dice);`

 `arena.startBattle();`

#### Viewing Results
The outcome of each battle will be displayed in the console, showing the attacks, defense rolls, damage dealt, and the remaining health of each player. The winner of the battle will also be announced at the end.

### Extensibility
The Arena Battle Simulator is designed to be extensible, allowing for future enhancements and modifications:

#### Custom Player Types: We can create custom player types by implementing the Player interface.
#### Custom Dice: Different types of dice can be implemented by implementing the Dice interface.
#### Additional features: The codebase can be extended to include new features such as special player abilities or advanced battle mechanics.
