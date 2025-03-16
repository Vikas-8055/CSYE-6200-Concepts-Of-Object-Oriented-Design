package edu.northeastern.csye6200;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    
    public double getWidth() {
        return width;
    }

    
    public double getHeight() {
        return height;
    }

    
    @Override
    public double getArea() {
        return width * height;
    }

  
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width %.2f and height %.2f", width, height);
    }
}