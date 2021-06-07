package shapes;




public class Rectangle extends Shape.Quadrilateral implements Measurable{
    protected double length;
    protected double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
// Rectangle
    public Rectangle() {

    }

    @Override
    public double getPerimeter() {
        return ((2*length)+(2*width));
    }

    @Override
    public double getArea() {
        return (length*width);
    }


//    public double getArea(){
//        return getArea();
//    }
//
//    public double getPerimeter(){
//
//    }

}
