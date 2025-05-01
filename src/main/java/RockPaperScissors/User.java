package RockPaperScissors;

import java.util.Scanner;

public class User {
    private Scanner scanner;
    //TODO move scanner into userscanner class and then link
    // could create a standard user that goes off of pre reg data, or use a save? file idk
    public User() {
        scanner = new Scanner(System.in);
    }

    // ask player for move, return 0 (rock), 1 (paper), or 2 (scissors)
    public int getMove() {
        System.out.println("Please enter rock, paper, or scissors:");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("rock")) return 0;
        if (input.equalsIgnoreCase("paper")) return 1;
        if (input.equalsIgnoreCase("scissors")) return 2;

        return -1; // invalid
    }

    public void closeScanner() {
        scanner.close(); // good practice
    }
}
