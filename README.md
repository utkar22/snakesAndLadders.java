# Snakes and Ladders

Welcome to my implementation of the Snakes and Ladders game in Java!

## Project Description

In this project, I have created a console-based version of the Snakes and Ladders game using Object-Oriented Programming (OOP) concepts. The objective of the game is to navigate through the game floors, accumulate points, and interact with different types of floors: empty floors, snake floors, and ladder floors.

To ensure a robust implementation, I have incorporated the following OOP concepts:
- Classes and objects
- Class relationships
- Inheritance
- Polymorphism

## Game Features

### Player

In my game, I have implemented a single-player mode. The player has a name and keeps track of their current position on the game floor after each move.

### Game Floors

The game consists of 14 floors. Each floor can be categorized as one of the following types:
- Empty Floor: Rewards the player with one point and displays a message indicating that the player has reached an empty floor.
- Normal Snake Floor: Deducts two points from the player's total and displays a message indicating that the player has encountered a normal snake floor. The player's position is then moved to the first floor.
- King Cobra Snake Floor: Deducts four points from the player's total and displays a message indicating that the player has encountered a king cobra snake floor. The player's position is then moved to the third floor.
- Normal Ladder Floor: Rewards the player with two points and displays a message indicating that the player has reached a normal ladder floor. The player's position is then moved to the twelfth floor.
- Elevator Floor: Rewards the player with four points and displays a message indicating that the player has reached an elevator floor. The player's position is then moved to the tenth floor.
- Tornado Floor: This is a special floor that triggers a tornado event. When the player lands on a Tornado Floor, they will be moved a random number of tiles in either direction (forward or backward). The player's position will be updated accordingly, and a message indicating the new position will be displayed.

Please note that the Tornado Floor is an additional feature I have implemented for extra excitement and unpredictability in the game.

### Dice

For dice rolling, I have used a special dice with only two faces: 1 and 2. The dice randomly returns one of these two values, simulating the rolling mechanism.

## Installation
To download and run the game, follow these steps:

1. Clone the repository to your local machine:

   ```shell
   git clone https://github.com/your-username/snakes-and-ladders.git
   ```
   
2. Navigate to the `src` directory:

   ```shell
   cd snakes-and-ladders/src
   ```
  
3. Compile the Java files:

   ```shell
   javac Game.java
   ```
  
4. Run the game:

   ```shell
   java Game
   ```

## How to Play

1. Run the game application.
2. Enter your player name when prompted.
3. The game setup will be initialized.
4. Press Enter to roll the dice.
5. If the dice rolls a value other than 1, the game cannot start yet.
6. Continue rolling the dice by pressing Enter until you get a 1.
7. Once you roll a 1, the game starts, and you will see the player's position on the floor and the corresponding actions.
8. Keep rolling the dice and following the prompts until the game is over.
9. The game ends when the player reaches the end floor, and the final points accumulated are displayed.
