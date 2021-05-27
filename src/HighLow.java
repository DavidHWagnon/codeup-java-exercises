import java.util.Scanner;
import java.lang.Math;

public class HighLow {



    public static void guessingGame() {
        Scanner scanner = new Scanner(System.in);
        int number = 1 + (int)(100  * Math.random());
        int chances = 5;
        int guess;
        int i;

        System.out.println("Welcome to our new High-Low Guessing game! Go ahead and try to guess our number between 1 - 100");

        for (i = 0; i < chances; i++) {
            System.out.println("Guess a number");
            guess = scanner.nextInt();
            if (guess == number) {
                System.out.println("GOOD GUESS! It only took you " + i + " guesses");
                break;
            } else if (guess < number && i != chances - 1) {
                System.out.println("Higher");
            } else if (guess > number && i != chances - 1) {
                System.out.println("Lower");
            }

        }
        if (i == chances) {
            System.out.println("You have exhausted your chancesc");

            System.out.println(
                    "The number was " + number);
        }
    }
    public static void main(String[] args) {
        guessingGame();
    }
}
