import java.util.Scanner;


public class ConsoleIOLecture {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String name = "David";

        System.out.printf("Hello, %s", name);

        System.out.format("%d is %s's favorite number", 42, name);

        System.out.println("I'm on a new line.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey friend, how's it going?");
        String userInput = scanner.next();

        System.out.printf("You're feeling: %s%n", userInput);

        System.out.println("Gimme a number");
        String userNumber = scanner.next();

        System.out.printf("Your number is : %s%n", userNumber);


    }
}
