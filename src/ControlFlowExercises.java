import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;

//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        }while(i<=100);

//        i = 100;
//
//        do {
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);

//        i = 2;
//
//        do {
//            System.out.println(i);
//            i *= i;
//        }while(i < 1000000);

        //Refactored FOR LOOPS below

//        for(int x = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//
//        for(int x = 0; i <= 100;){
//            System.out.println(i);
//            i += 2;
//        }
//
//        for(int x = 100; i >= -10;){
//            System.out.println(i);
//            i -= 5;
//        }
//
//        for(int x =2; i <= 1000000;){
//            System.out.println(i);
//            i *= i;
//        }

        Scanner scanner1 = new Scanner(System.in);
        final int PIN = 12345;
        int userInput = scanner1.nextInt();
        int attempts = 3;
        for (int x = 1; x <= attempts;)x++;{
                System.out.println("Please enter pin:");
                if(userInput == PIN){
                    System.out.println("Correct, welcome back!");
                } else{
                    System.out.println("Incorrect, try again");
                }

        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("What number would you like to go up to? ");
        int userNumber = scanner.nextInt();
        System.out.print(userNumber);

        System.out.println("Here is your table");

        for(int x = 0; x <= userNumber; x++){
            if(x == 0){
                System.out.println("number | squared | cubed");
                System.out.println("------ | ------- | -----");
            }else{
                System.out.println(x + "      | " + x*x + "       | " + x*x*x);
            }
        }



        for(int x = 0; x < 1;){
            System.out.println("Give me a number from 0 - 100.");
            int userGrade = scanner.nextInt();

                if(userGrade == 100){
                    System.out.println("A " + userGrade + " is a(n) A+! Perfect Score!");
                    System.out.println("Would you like to continue? Type 'Yes' or 'No'");

                    String response = scanner.next();

                    if(response.toLowerCase() == "yes"){
                        continue;
                    } else{
                        i ++;
                    }
                }
                if(userGrade >= 98){
                    System.out.println("A " + userGrade + " is a(n) A+! Incredible Work!");
                    System.out.println("Would you like to continue? Type 'Yes' or 'No'");

                    String response = scanner.next();
                    if(response.toLowerCase() == "yes"){
                        continue;
                    } else{
                        i ++;
                    }
                }
                if(userGrade >= 92 && userGrade< 98){
                    System.out.println("A " + userGrade + " is a(n) A! Fantastic Job");
                    System.out.println("Would you like to continue? Type 'Yes' or 'No'");

                    String response = scanner.next();
                    if(response.toLowerCase() == "yes"){
                        continue;
                    } else{
                        i ++;
                    }
                }
                if(userGrade >= 88 && userGrade< 91){
                    System.out.println("A " + userGrade + " is a(n) A-! Amazing Job");
                    System.out.println("Would you like to continue? Type 'Yes' or 'No'");

                    String response = scanner.next();
                    if(response.toLowerCase() == "yes"){
                        continue;
                    } else{
                        i ++;
                    }
                }
                if(userGrade >= 86 && userGrade < 88){
                    System.out.println("A " + userGrade + " is a(n) B+! Great Job");
                    System.out.println("Would you like to continue? Type 'Yes' or 'No'");

                    String response = scanner.next();
                    if(response.toLowerCase() == "yes"){
                        continue;
                    } else{
                        i ++;
                    }
                }
                if(userGrade >= 83 && userGrade< 86){
                    System.out.println("A " + userGrade + " is a(n) B! Great Job");
                    System.out.println("Would you like to continue? Type 'Yes' or 'No'");

                    String response = scanner.next();
                    if(response.toLowerCase() == "yes"){
                        continue;
                    } else{
                        i ++;
                    }
                }
                if(userGrade >= 80 && userGrade< 83){
                    System.out.println("A " + userGrade + " is a(n) B-! Great Job");
                    System.out.println("Would you like to continue? Type 'Yes' or 'No'");

                    String response = scanner.next();
                    if(response.toLowerCase() == "yes"){
                        continue;
                    } else{
                        i ++;
                    }
                }
                if(userGrade >= 77 && userGrade < 80){
                    System.out.println("A " + userGrade + " is a(n) C+! Good Job");
                    System.out.println("Would you like to continue? Type 'Yes' or 'No'");

                    String response = scanner.next();
                    if(response.toLowerCase() == "yes"){
                        continue;
                    } else{
                        i ++;
                    }
                }
                if(userGrade >= 71 && userGrade< 77){
                    System.out.println("A " + userGrade + " is a(n) C! Passable.");
                    System.out.println("Would you like to continue? Type 'Yes' or 'No'");

                    String response = scanner.next();
                    if(response.toLowerCase() == "yes"){
                        continue;
                    } else{
                        i ++;
                    }
                }
                if(userGrade >= 67 && userGrade< 71){
                    System.out.println("A " + userGrade + " is a(n) C-! Needs Work.");
                    System.out.println("Would you like to continue? Type 'Yes' or 'No'");

                    String response = scanner.next();
                    if(response.toLowerCase() == "yes"){
                        continue;
                    } else{
                        i ++;
                    }
                }
                if(userGrade >= 60 && userGrade < 67){
                    System.out.println("A " + userGrade + " is a(n) D! You failed");
                    System.out.println("Would you like to continue? Type 'Yes' or 'No'");

                    String response = scanner.next();
                    if(response.toLowerCase() == "yes"){
                        continue;
                    } else{
                        i ++;
                    }
                }
                if(userGrade< 60 && userGrade >= 0){
                    System.out.println("A " + userGrade + " is a(n) F! You Failed.");
                    System.out.println("Would you like to continue? Type 'Yes' or 'No'");

                    String response = scanner.next();
                    if(response.toLowerCase() == "yes"){
                        continue;
                    } else{
                        i ++;
                    }
                }
        }



    }
}
