package com.epita.fr.Triangle;

import java.util.Scanner;

public class Triangle {

    public Double areaTriangle(){
        System.out.println("You are about to calculate the Area of a Triangle ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of your Triangle ");
        Double base =  scanner.nextDouble();

        System.out.println("Enter the height of your Triangle ");
        Double height =  scanner.nextDouble();
        Double area = (base * height) / 2;

        System.out.println("The area of your Triangle is: " + area);

        return area;
    }

    public Double perimeterTriangle(){
        System.out.println("You are about to calculate the Perimeter of a Triangle ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of your Triangle ");
        Double base =  scanner.nextDouble();

        System.out.println("Enter the side1 of your Triangle ");
        Double side1 =  scanner.nextDouble();

        System.out.println("Enter the side2 of your Triangle ");
        Double side2 =  scanner.nextDouble();

        Double perimeter = base+side1+side2;

        System.out.println("The perimeter of your Triangle is: " + perimeter);

        return perimeter;
    }
}
