package shapes;
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner circleScanner = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        double circleRadius = circleScanner.nextDouble();
        Circle test = new Circle(circleRadius);
        test.getArea();
        test.getCircumference();
    }
}
