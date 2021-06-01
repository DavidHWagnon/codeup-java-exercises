import java.util.Scanner;

public class person {
    private String name;

    public String getName(){
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String nameName = scanner.nextLine();
        return nameName;
    }

    public void setName(String name){
        name = getName();
    }
    public void sayHello(){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        person p1 = new person();
        p1.name = p1.getName();
        p1.sayHello();
    }
}

