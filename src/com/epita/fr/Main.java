package com.epita.fr;

import com.epita.fr.classes.Circles;
import com.epita.fr.classes.Squares;
import com.epita.fr.classes.Triangles;
import com.epita.fr.services.Circle.Circle;
import com.epita.fr.services.Square.Square;
import com.epita.fr.services.Triangle.Triangle;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("--- ***: Triangle Calculations Here :*** --- ");

        Triangle triangle = new Triangle();
        Triangles triangles = new Triangles();
        triangle.areaTriangle(triangles);
        triangle.perimeterTriangle(triangles);

        System.out.println("--- ***: Square Calculations Here :*** --- ");

        Square square = new Square();
        Squares squares = new Squares();
        square.areaSquare(squares);
        square.perimeterSquare(squares);

        System.out.println("--- ***: Circle Calculations Here :*** --- ");

        Circle circle = new Circle();
        Circles circles = new Circles();
        circle.areaOfCircle(circles);
        circle.perimterOfCircle(circles);
    }
}
