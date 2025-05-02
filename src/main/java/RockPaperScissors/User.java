package RockPaperScissors;

import java.util.Scanner;

public class User {
    private Scanner scanner;

    public User() {
        scanner = new Scanner(System.in);
    }

    // Ask player for move, return enum
    public GameSettings.Move getMove() {
        System.out.println("Please enter rock, paper, or scissors:");
        String input = scanner.nextLine();

        GameSettings.Move move = GameSettings.Move.fromString(input); // Convert input to Move enum

        if (move == null) {
            return null; // Invalid input
        }

        return move; // Valid move
    }

    public void closeScanner() {
        scanner.close(); // good practice
    }
}
