package com.epita.fr;

import com.epita.fr.Circle.Circle;
import com.epita.fr.Square.Square;
import com.epita.fr.Triangle.Triangle;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("--- ***: Triangle Calculations Here :*** --- ");

        Triangle triangle = new Triangle();
        triangle.areaTriangle();
        triangle.perimeterTriangle();

        System.out.println("--- ***: Square Calculations Here :*** --- ");

        Square square = new Square();
        square.areaSquare();
        square.perimeterSquare();

        System.out.println("--- ***: Circle Calculations Here :*** --- ");

        Circle circle = new Circle();
        circle.areaOfCircle();
        circle.perimterOfCircle();
    }
}
