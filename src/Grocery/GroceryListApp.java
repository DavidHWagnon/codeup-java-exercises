package Grocery;

import grades.Student;

import java.util.HashMap;
import java.util.Scanner;

public class GroceryListApp extends Groceries{

    public GroceryListApp(String name) {
        super(name);
    }

    public static void main(String[] args) {
        for(int x = 0; x < 1;){
            System.out.println("Would you like to create a grocery list?");
            Scanner scanner = new Scanner(System.in);
            String yesNo = scanner.nextLine();

            if(yesNo.equalsIgnoreCase("Y")||yesNo.equalsIgnoreCase("YES")){
                HashMap<String, Groceries> groceries = new HashMap<>();
                Groceries g1 = new Groceries("myList");
                System.out.println("Select your category of grocery. \n| Meat | Veggie | Fruit | Drink |");
                String category = scanner.nextLine();

                if(category.equalsIgnoreCase("MEAT")){
                    System.out.println("What would you like to add to your MEAT list?");
                    String groceryItem = scanner.nextLine();
                    System.out.println("How many would you like to add?");
                    int groceryAmount = scanner.nextInt();
                    for (int n = 0; n < groceryAmount; n ++){
                        g1.addMeat(groceryItem);
                    }
                    System.out.println("Would you like to add more items?");
                    String repeat = scanner.nextLine();
                    if(repeat.equalsIgnoreCase("Y")||repeat.equalsIgnoreCase("YES")){
                        x = 0;
                    }else{
                        System.out.println("");
                        x ++;
                    }


                } else if (category.equalsIgnoreCase("VEGGIE")){
                    System.out.println("What would you like to add to your VEGGIE list?");
                    String groceryItem = scanner.nextLine();
                    System.out.println("How many would you like to add?");
                    int groceryAmount = scanner.nextInt();
                    for (int n = 0; n < groceryAmount; n ++){
                        g1.addVeggie(groceryItem);
                    }

                } else if (category.equalsIgnoreCase("FRUIT")){
                    System.out.println("What would you like to add to your FRUIT list?");
                    String groceryItem = scanner.nextLine();
                    System.out.println("How many would you like to add?");
                    int groceryAmount = scanner.nextInt();
                    for (int n = 0; n < groceryAmount; n ++){
                        g1.addFruit(groceryItem);
                    }

                } else if (category.equalsIgnoreCase("DRINK")){
                    System.out.println("What would you like to add to your DRINK list?");
                    String groceryItem = scanner.nextLine();
                    System.out.println("How many would you like to add?");
                    int groceryAmount = scanner.nextInt();
                    for (int n = 0; n < groceryAmount; n ++){
                        g1.addDrink(groceryItem);
                    }

                }
            }else{
                x ++;
            }
        }
    }
}
