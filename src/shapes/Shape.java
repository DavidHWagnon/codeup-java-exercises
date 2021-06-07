package shapes;

public abstract class Shape {
    abstract static class Quadrilateral extends Shape{
        protected double length;
        protected double width;

        Quadrilateral(){}

        Quadrilateral(double length, double width){
            this.length = length;
            this.width = width;
        }

        public double getWidth(){
            return width;
        }
        public double getLength(){
            return length;
        }
    }
}
