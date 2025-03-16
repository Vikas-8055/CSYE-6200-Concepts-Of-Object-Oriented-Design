package edu.northeastern.csye6200;

public class LAB9P2 {
    public static void main(String[] args) {
        
        GeometricObject[] objects = {
            new Square(2),
            new Circle(5),
            new Square(5),
            new Rectangle(3, 4),
            new Square(4.5)
        };

       
        for (GeometricObject obj : objects) {
            System.out.printf("Area is %.2f%n", obj.getArea());

           
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
        }
    }
}


interface Colorable {
    void howToColor();
}

class Square extends GeometricObject implements Colorable {

    private double side;


    public Square(double side) {
        this.side = side;
    }


    public double getSide() {
        return side;
    }


    @Override
    public double getArea() {
        return side * side;
    }


    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}