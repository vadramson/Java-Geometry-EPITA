package com.epita.fr.services.Square;

import com.epita.fr.classes.Squares;

import java.util.Scanner;

public class Square {

    public Double areaSquare(Squares squares){
        System.out.println("You are about to calculate the Area of a Square ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the Square");
        squares.setLength(scanner.nextDouble());
        Double area = squares.getLength() * squares.getLength();

        System.out.println("The area of your Square is: " + area);

        return area;
    }


    public Double perimeterSquare(Squares squares){

        System.out.println("You are about to calculate the Perimeter of a Square ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the Square");

        squares.setLength(scanner.nextDouble());
        Double perimeter = 4 * squares.getLength();

        System.out.println("The perimeter of your Square is: " + perimeter);

        return perimeter;
    }
}
