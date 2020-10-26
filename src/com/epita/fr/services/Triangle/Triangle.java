package com.epita.fr.services.Triangle;

import com.epita.fr.classes.Triangles;

import java.util.Scanner;

public class Triangle {

    public Double areaTriangle(Triangles triangles){
        System.out.println("You are about to calculate the Area of a Triangle ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of your Triangle ");
        triangles.setBase(scanner.nextDouble());

        System.out.println("Enter the height of your Triangle ");
        triangles.setHeight(scanner.nextDouble());
        Double area = (triangles.getBase() * triangles.getHeight()) / 2;

        System.out.println("The area of your Triangle is: " + area);

        return area;
    }

    public Double perimeterTriangle(Triangles triangles){
        System.out.println("You are about to calculate the Perimeter of a Triangle ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of your Triangle ");
        triangles.setBase(scanner.nextDouble());

        System.out.println("Enter the side1 of your Triangle ");
        triangles.setSide1(scanner.nextDouble());

        System.out.println("Enter the side2 of your Triangle ");
        triangles.setSide2(scanner.nextDouble());

        Double perimeter = triangles.getBase()+triangles.getSide1()+triangles.getSide2();

        System.out.println("The perimeter of your Triangle is: " + perimeter);

        return perimeter;
    }
}
