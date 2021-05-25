import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
//        int x = 5;
//        if (x == 5){
//            System.out.println("If you are reading this it means x is 5");
//        }
//
//        int y = 2;
//        y = 3;
//        if (y == 2){
//            System.out.println("I've carried out a conditional tset and I can confirm that the statement 'y == 2' is true");
//        } else {
//            System.out.println("I have tested to see if 'y==2' is true, and it's not. It is false");
//        }

//        short y = -5;
//        if (y < 0){
//            System.out.println("The variable y contains a negative number value");
//        } else if (y >= 0 && y < 30000){
//            System.out.println("The variable y contains a positive number value");
//        } else {
//            System.out.println("The variable y contains a numeric value that is dangerously close to the max value for short type variables which is " + Short.MAX_VALUE);
//        }
//
//        String customerChoice = "";
//        customerChoice = "chocolate";
//
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla coming right up");
//                break;
//            case "chocolate":
//                System.out.println("Chocolate coming right up");
//                break;
//            case "strawberry":
//                System.out.println("Strawberry coming right up");
//                break;
//            default:
//                System.out.println("No we don't have that!");
//                break;
//        }

//        int customerMaxBudget = 10;
        // Can't use boolean decisions in switch statements
//        switch (customerMaxBudget){
//            case (>=0 && <10000){
//                System.out.println("You don't have enough money");
//                break;
//            }
//        }

        // Logical Operators

//        int c = 0, d = 100, e = 50;
//
//        if (c == 1 && e ++ < 100){
//            //do anything
//        }
//        System.out.println("e = " + e);
//
//
//        if (c == 0 && e ++ < 100){
//            d = 150;
//        }
//        System.out.println("e = " + e);
//
//        if (c == 1 & e ++ < 100){
//            //do anything
//        }
//        System.out.println("e = " + e);

        // there is no strict equality operator
        // inequality operator !=
        // there is no inequality don't do this : !==

        // these are stored in the string pool
//        String myName = "David";
//        String anotherDavid = "David";
//
//        String david = new String("David");
//
//        System.out.println(myName == anotherDavid);
//        System.out.println(myName = david);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userInput = scanner.next();
//            if (userInput == myName){
//                System.out.println("Hello, me!");
//            } else {
//                System.out.println("You are not me");
//            }
//
//            if(userInput.equals(myName)){
//                System.out.println("Hello, me!");
//            } else {
//                System.out.println("You are not me!");
//            }

            int i = 1;
            while(i<10){
                System.out.println("Now I'm in the loop");
                i++;
                System.out.println("Still in the loop, but i has incremented and the new value of i is: " + i);
            }
        System.out.println("This is outside the loop after it has executed. The conditional has testesd false. The value of i is now: " + i);





    }
}
