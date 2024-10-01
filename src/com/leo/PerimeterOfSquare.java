package com.leo;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // prompt user to input the length of the square
        System.out.print("Enter the length of the square: ");
        double length = in.nextDouble(); //reads the input as double

        // call the calculatePerimeter method to compute the perimeter
        double perimeter = calculatePerimeter(length);
        // print the computed perimeter
        System.out.println("The perimeter of circle is: " + perimeter);

        in.close();
    }

    // call the calculatePerimeter method to compute the instance
    private static double calculatePerimeter (double length) {
        // formula of perimeter = 4 * length
        double perimeter = 4 * length;

        return perimeter;

    }
}
