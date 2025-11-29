package com.kodilla.abstracts.homework;

public class ShapeApplication {
    public static void main(String [] args){
        Shape Rectangle = new Rectangle(3,4);
        Shape Square = new Square(2);

        Shape[] shapes = {Rectangle, Square};

        for (Shape shape : shapes) {
            System.out.println("Figure: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}
