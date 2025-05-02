package RockPaperScissors;

import RockPaperScissors.GameSettings.Move;

public class Game {

    public static void main(String[] args) {
        int maxGuesses = 3;
        int playerGuesses = 0;

        User player = new User();
        GenerateMove generator = new GenerateMove();

        while (playerGuesses < maxGuesses) {
            Move playerMove = player.getMove();

            if (playerMove == null) {
                System.out.println("Invalid move. Game exiting.");
                break;
            }

            Move computerMove = generator.generateMove();
            System.out.println("Computer chose: " + computerMove);

            if (playerMove == computerMove) {
                System.out.println("Draw");
            } else if (
                    (playerMove == Move.ROCK && computerMove == Move.SCISSORS) ||
                            (playerMove == Move.PAPER && computerMove == Move.ROCK) ||
                            (playerMove == Move.SCISSORS && computerMove == Move.PAPER)
            ) {
                System.out.println("You won!");
            } else {
                System.out.println("You lose");
            }

            playerGuesses++;
        }

        player.closeScanner();
    }
}
