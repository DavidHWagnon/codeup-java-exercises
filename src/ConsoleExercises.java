import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately: %.2f %n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer");
        int userInt = scanner.nextInt();

        System.out.println("Enter 3 Words");

        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();

        System.out.println("\n" + wordOne + " " + wordTwo + " " + wordThree );


        // New Scanner specifically for sentence and area/perimeter
        Scanner sentence = new Scanner(System.in);

        System.out.println("Enter a sentence");

        String userSentence = sentence.nextLine();

        System.out.println(userSentence);


        System.out.println("Enter the length and width of your classroom at CodeUp");

        double length = sentence.nextDouble();

        double width = sentence.nextDouble();

        double perimeter = (2*length) + (2*width);

        double area = length * width;

        System.out.println("The perimeter of your class room is : " + perimeter);

        System.out.println("The area of your class room is : " + area);


    }
}
