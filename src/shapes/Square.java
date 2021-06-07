package shapes;

public class Square extends Shape.Quadrilateral implements Measurable{
    double side;
    public Square(double side){
        super();
        this.side = side;
        length = side;
        width = side;
    }
    @Override
    public double getArea(){
        return side * side;
    }
    @Override
    public double getPerimeter(){
        return side * 4;
    }


}
