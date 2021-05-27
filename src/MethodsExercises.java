import java.util.Scanner;

public class MethodsExercises {

    public static int addition (int x, int y){
        return x + y;
    }
    public static int subtraction (int x, int y){
        return x - y;
    }
    public static int multiplication (int x, int y){
        return x * y;
    }
    public static int division (int x, int y){
        return x / y;
    }
    public static int modulus (int x, int y){
        return x % y;
    }
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userNumber = scanner.nextInt();
        if(userNumber > min && userNumber < max){
            System.out.println(userNumber + " is between " + min + " and " + max);
        } else{
            getInteger(min,max);
        }
        return  min;
    }

    public static void getFactorial(){
        Scanner factScan = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 10: ");
        int factNumber = factScan.nextInt();
        long factorial = 1;
        if(factNumber > 1 && factNumber < 10){

            for(int i = 1; i <= factNumber; i++){
                factorial = factorial * i;
            }
            System.out.print(factNumber + "! = " + factorial);
        } else{
            getFactorial();
        }
    }

    public static void main(String[] args) {
        int userInput = getInteger(1, 10);
        System.out.println(userInput);

        getFactorial();

    }




}
