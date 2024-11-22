import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Makes a print that asks the user to input the length of the hexagon.
        System.out.print("Enter the side length of the hexagon: ");
        double side = input.nextDouble();

        //Using the formula given in a picture in the assignment, this is the equation to find
        //the area.
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

        //This displays the area of the hexagon, given from the equation, to the user.
        System.out.printf("The area of the hexagon is: %.2f%n", area);
    }
}

