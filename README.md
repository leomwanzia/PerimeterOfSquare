  # PerimeterOfSquare

Explanation Line by Line:
Import Scanner Class:


    import java.util.Scanner;
This line imports the Scanner class from the java.util package, which is used to read input from the user.

Class Declaration:


    public class SquarePerimeter {
This line declares a public class named SquarePerimeter.

Main Method Declaration:

    public static void main(String[] args) {
This line starts the declaration of the main method, which is the entry point of the program.

Create Scanner Object:


    Scanner in = new Scanner(System.in);
This line creates a Scanner object named in to read input from the standard input (usually the keyboard).

Prompt User for Side Length:


    System.out.println("Enter the side length of the square:");
    double side = in.nextDouble(); // Reads the input in double
These lines prompt the user to enter the side length of the square and read the input as a double.

Calculate Perimeter:


    double perimeter = calculatePerimeter(side);
This line calls the calculatePerimeter method with side as an argument and stores the returned value in a variable named perimeter.

Print the Result:
  
    System.out.println("The perimeter of the square is: " + perimeter + " units");
This line prints the calculated perimeter to the console.

Close Scanner Object:

    in.close();
This line closes the Scanner object to free up resources.

Calculate Perimeter Method:


    private static double calculatePerimeter(double side) {
This line declares a private static method named calculatePerimeter that takes one double parameter: side.

Perimeter Calculation:


    double perimeter = 4 * side;
This line calculates the perimeter of the square using the formula 

    4×side, where side is the length of one side of the square.

Return the Perimeter:


    return perimeter;
