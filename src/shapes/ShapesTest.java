package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(6,6);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        Measurable mySquare = new Square(5);
        System.out.println(mySquare.getPerimeter());
        System.out.println(mySquare.getArea());

//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
    }
}
