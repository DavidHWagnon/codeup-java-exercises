package Grocery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

public class Groceries {
    private String name;
    private ArrayList<String> meat = new ArrayList<>();
    private ArrayList<String> veggies = new ArrayList<>();
    private ArrayList<String> fruits = new ArrayList<>();
    private ArrayList<String> drinks = new ArrayList<>();

    public Groceries(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addMeat(String name){
        meat.add(name);
    }
    public void addVeggie(String name){
        veggies.add(name);
    }
    public void addFruit(String name){
        fruits.add(name);
    }
    public void addDrink(String name){
        drinks.add(name);
    }
    public void getLists(){
        Collections.sort(meat);
        System.out.println(meat);

        Collections.sort(veggies);
        System.out.println(veggies);

        Collections.sort(fruits);
        System.out.println(fruits);

        Collections.sort(drinks);
        System.out.println(drinks);

        System.out.println("Here is your final grocery list!");
    }


}
