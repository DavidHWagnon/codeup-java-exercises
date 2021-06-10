package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public int myInt;
    public double myDouble;

    public String getString(){
        Scanner getString = new Scanner(System.in);
        System.out.println("Tell me something.");
        String string = getString.nextLine();
        System.out.println(string);
        return string;
    }


    boolean yesNo(){
        Scanner YN = new Scanner(System.in);
        System.out.println("Enter Yes or No.");
        String response = YN.nextLine();
        if(response.toLowerCase().equals("yes")||response.toLowerCase().equals("y")){
            System.out.println("true");
            return true;
        } else{
            System.out.println("false");
            return false;
        }
    }

    int getInt(int min, int max){
        Scanner getIntScanner = new Scanner(System.in);
        System.out.println("Give me an int between 1 and 100");
        int intResponse = getIntScanner.nextInt();
        if(intResponse > min && intResponse < max){
            myInt = intResponse;

        }else {
            getInt(min,max);
        }
        return myInt;
    }

    int getInt(){
        System.out.println(myInt);
        return myInt;
    }

    @SuppressWarnings("all")
    public int getIntt(String prompt){
        System.out.println(prompt + "\n");
        try{
            return Integer.valueOf(getString());
        }catch(NumberFormatException e){
            System.out.println("That's not a number!");
            return getIntt("Please enter a whole number");
        }
    }


    double getDouble(double min, double max){
        Scanner getDoubleScanner = new Scanner(System.in);
        System.out.println("Give me a double between 1 and 100");
        double doubleResponse = getDoubleScanner.nextInt();
        if(doubleResponse > min && doubleResponse < max){
            myDouble = doubleResponse;

        }else {
            getDouble(min,max);
        }
        return myDouble;
    }

    double getDouble(){
        System.out.println(myDouble);
        return myDouble;
    }



}
