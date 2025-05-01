package RockPaperScissors;

public class Game {
    public static void main(String[] args) {
        int maxGuesses = 3;
        int playerGuesses = 0;

        User player = new User();
        GenerateMove generator = new GenerateMove();
        //TODO change this so it follows the rules of the challenge more, asks for a rematch
        //could maybe introduce a jframe with a win/lose pic?
        //maybe introduce game mode where you go as high as you can without losing setting scores
        //once you lose in that game mode it would redirect to the options of which mode after telling score
        while (playerGuesses < maxGuesses) {
            int playerMove = player.getMove(); // ask user for move
            if (playerMove == -1) {
                System.out.println("Invalid move. Game exiting.");
                break;
            }

            int computerMove = generator.generateMove(); // generate computer move
            System.out.println("Computer chose: " + moveName(computerMove));

            if (playerMove == computerMove) {
                System.out.println("Draw");
            } else if (
                    (playerMove == 0 && computerMove == 2) ||
                            (playerMove == 1 && computerMove == 0) ||
                            (playerMove == 2 && computerMove == 1)
            ) {
                System.out.println("You won!");
            } else {
                System.out.println("You lose");
            }

            playerGuesses++;
        }

        player.closeScanner(); // close input after game
    }

    //TODO make this the enum and probs move into game settings
    public static String moveName(int move) {
        if (move == 0) return "Rock";
        else if (move == 1) return "Paper";
        else return "Scissors";
    }
}
