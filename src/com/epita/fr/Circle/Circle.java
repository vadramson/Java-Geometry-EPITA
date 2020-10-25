package com.epita.fr.Circle;

import java.util.Scanner;

public class Circle {

    public Double areaOfCircle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are About to calculate the Area of a Circle:");
        System.out.println("Enter the radius of the Circle:");
        Double radius = scanner.nextDouble();
        Double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The Area of the Circle is :" + area);

        return area;
    }

    public Double perimterOfCircle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are About to calculate the perimter of a Circle:");
        System.out.println("Enter the radius of the Circle:");
        Double radius = scanner.nextDouble();
        Double perimeter = 2 * Math.PI * radius;

        System.out.println("The perimeter of the Circle is :" + perimeter);

        return perimeter;
    }

}
