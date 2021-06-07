package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication extends Student{


    public GradesApplication(String name) {
        super(name);

    }



    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("David");
        s1.addGrade(100);
        s1.addGrade(90);
        s1.addGrade(95);

        Student s2 = new Student("Javier");
        s2.addGrade(99);
        s2.addGrade(93);
        s2.addGrade(97);

        Student s3 = new Student("Jay");
        s3.addGrade(99);
        s3.addGrade(97);
        s3.addGrade(98);

        Student s4 = new Student("Tobirama");
        s4.addGrade(60);
        s4.addGrade(100);
        s4.addGrade(89);

        students.put("radi0guy64", s1);
        students.put("j4amazon", s2);
        students.put("flyGuy98", s3);
        students.put("uchihah8r", s4);



        System.out.println("Welcome!");

        System.out.printf("Here are the Github usernames of our students:\n %s| \n",students.keySet());

        for(int x = 0; x < 1;){
            System.out.println("What student would you like to see information on?");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("radi0guy64")){
                System.out.println("Name: " + students.get("radi0guy64").getName());
                System.out.println("GPA: " + students.get("radi0guy64").getGradeAverage());
                System.out.println("Would you like to see students information?");
                String yesNo = scanner.nextLine();
                if(yesNo.equalsIgnoreCase("Y") || yesNo.equalsIgnoreCase("Yes")){
                    x = 0;
                } else {
                    x ++;
                }

            } else if(input.equalsIgnoreCase("j4amazon")){
                System.out.println("Name: " + students.get("j4amazon").getName());
                System.out.println("GPA: " + students.get("j4amazon").getGradeAverage());
                System.out.println("Would you like to see students information?");
                String yesNo = scanner.nextLine();
                if(yesNo.equalsIgnoreCase("Y") || yesNo.equalsIgnoreCase("Yes")){
                    continue;
                } else {
                    x ++;
                }

            } else if(input.equalsIgnoreCase("flyGuy98")){
                System.out.println("Name: " + students.get("flyGuy98").getName());
                System.out.println("GPA: " + students.get("flyGuy98").getGradeAverage());
                System.out.println("Would you like to see students information?");
                String yesNo = scanner.nextLine();
                if(yesNo.equalsIgnoreCase("Y") || yesNo.equalsIgnoreCase("Yes")){
                    continue;
                } else {
                    x ++;
                }

            } else if(input.equalsIgnoreCase("uchihah8r")){
                System.out.println("Name: " + students.get("uchihah8r").getName());
                System.out.println("GPA: " + students.get("uchihah8r").getGradeAverage());
                System.out.println("Would you like to see students information?");
                String yesNo = scanner.nextLine();
                if(yesNo.equalsIgnoreCase("Y") || yesNo.equalsIgnoreCase("Yes")){
                    continue;
                } else {
                    x ++;
                }

            } else {
                System.out.println("Oop, " + input + " is not a username. Lets try that again");
                System.out.println("Would you like to see students information?");
                String yesNo = scanner.nextLine();
                if(yesNo.equalsIgnoreCase("Y") || yesNo.equalsIgnoreCase("Yes")){
                    continue;
                } else {
                    x ++;
                }
            }
        }

//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        if(input.equalsIgnoreCase("radi0guy64")){
//            System.out.println("Name: " + students.get("radi0guy64").getName());
//            System.out.println("GPA: " + students.get("radi0guy64").getGradeAverage());
//            System.out.println("Would you like to see another name?");
//
//        } else if(input.equalsIgnoreCase("j4amazon")){
//            System.out.println("Name: " + students.get("j4amazon").getName());
//            System.out.println("GPA: " + students.get("j4amazon").getGradeAverage());
//            System.out.println("Would you like to see another name?");
//
//        } else if(input.equalsIgnoreCase("flyGuy98")){
//            System.out.println("Name: " + students.get("flyGuy98").getName());
//            System.out.println("GPA: " + students.get("flyGuy98").getGradeAverage());
//            System.out.println("Would you like to see another name?");
//
//        } else if(input.equalsIgnoreCase("uchihah8r")){
//            System.out.println("Name: " + students.get("uchihah8r").getName());
//            System.out.println("GPA: " + students.get("uchihah8r").getGradeAverage());
//            System.out.println("Would you like to see another name?");
//
//        } else {
//            System.out.println("Oop, " + input + " is not a username. Lets try that again");
//        }







    }



}
