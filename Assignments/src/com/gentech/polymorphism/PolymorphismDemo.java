package com.gentech.polymorphism;

abstract class GeometricFigures{
    abstract void area();
}

class Square extends GeometricFigures{
    void area(){
        int side= 10;
        System.out.println("Area of square: "+ (side * side) );
    }
}

class Rectangle extends GeometricFigures{
    void area(){
        int length = 10;
        int breadth = 10;
        System.out.println("Area of Rectangle: "+ length * breadth);
    }
}

class Circle extends GeometricFigures{
    void area(){
        double pi = 3.14;
        int radius = 5;
        System.out.println("Area of Circle: "+ pi * radius * radius);
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        GeometricFigures figures = null;

        Square square = new Square();
        Rectangle rectangle =new Rectangle();
        Circle circle = new Circle();

        figures = square;
        figures.area();

        figures=rectangle;
        figures.area();

        figures=circle;
        figures.area();
    }
}
