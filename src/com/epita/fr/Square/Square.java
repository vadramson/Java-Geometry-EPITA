package com.epita.fr.Square;

import java.util.Scanner;

public class Square {

    public Double areaSquare(){
        System.out.println("You are about to calculate the Area of a Square ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the Square");

        Double length =  scanner.nextDouble();
        Double area = length * length;

        System.out.println("The area of your Square is: " + area);

        return area;
    }


    public Double perimeterSquare(){

        System.out.println("You are about to calculate the Perimeter of a Square ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the Square");

        Double length =  scanner.nextDouble();
        Double perimeter = 4 * length;

        System.out.println("The perimeter of your Square is: " + perimeter);

        return perimeter;
    }
}
