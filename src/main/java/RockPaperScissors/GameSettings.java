package RockPaperScissors;

public class GameSettings {

    public enum Move {
        ROCK,
        PAPER,
        SCISSORS;

        public static Move fromString(String input) {
            if (input == null) return null;
            switch (input.toLowerCase()) {
                case "rock": return ROCK;
                case "paper": return PAPER;
                case "scissors": return SCISSORS;
                default: return null;
            }
        }
    }
}
