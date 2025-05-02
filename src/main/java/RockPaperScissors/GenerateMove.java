package RockPaperScissors;

public class GenerateMove {
    public GameSettings.Move generateMove() {
        // get all the possible values of the Move enum, and choose a random one
        // calling values to get the array [Rock, Paper. Scissors]
        // using int there converts from double to int
        return GameSettings.Move.values()[(int) (Math.random() * 3)]; // 0, 1, or 2
    }
}
