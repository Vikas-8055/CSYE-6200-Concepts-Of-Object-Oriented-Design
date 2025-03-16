package edu.northeastern.csye6200;

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;

    
    public Octagon(double side) {
        this.side = side;
    }

    
    public double getSide() {
        return side;
    }

    
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public int compareTo(Octagon o) {
        return Double.compare(this.side, o.side);
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
                return 8 * side;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class LAB9P1 {
    public static void main(String[] args) {
        Octagon octagon1 = new Octagon(9);
        
        System.out.printf("Area is %.2f\n", octagon1.getArea());
        System.out.printf("Perimeter is %.2f\n", octagon1.getPerimeter());
        
        Octagon octagon2 = null;
        try {
            octagon2 = (Octagon) octagon1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Compare the methods " + octagon1.compareTo(octagon2));
    }
}
