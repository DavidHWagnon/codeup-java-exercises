import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int x = 0; x < 1;){
            System.out.println("What do you want to tell or ask Bob?");

            String userInput = scanner.nextLine();
            if(userInput.endsWith("?")){
                System.out.println("Bob: 'Sure.");
            } else if (userInput.endsWith("!")){
                System.out.println("Bob: 'Woah, chill out!");
            } else if (userInput.equals("")){
                System.out.println("Bob: 'Fine. Be that way!");
            } else {
                System.out.println("Bob: 'Whatever");
            }
            System.out.println("Do you want to continue?");

            String response = scanner.nextLine();
            if(response.toLowerCase().equals("yes")){
                continue;
            }else{
                break;
            }

        }



    }
}
