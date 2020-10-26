package com.epita.fr.services.Circle;

import com.epita.fr.classes.Circles;

import java.util.Scanner;

public class Circle {

    public Double areaOfCircle(Circles circles){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are About to calculate the Area of a Circle:");
        System.out.println("Enter the radius of the Circle:");
        circles.setRadius(scanner.nextDouble());
        Double area = Math.PI * Math.pow(circles.getRadius(), 2);

        System.out.println("The Area of the Circle is :" + area);

        return area;
    }

    public Double perimterOfCircle(Circles circles){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are About to calculate the perimter of a Circle:");
        System.out.println("Enter the radius of the Circle:");
        circles.setRadius(scanner.nextDouble());
        Double perimeter = 2 * Math.PI * circles.getRadius();

        System.out.println("The perimeter of the Circle is :" + perimeter);

        return perimeter;
    }

}
