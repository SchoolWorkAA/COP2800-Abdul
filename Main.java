import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //This print will be asking the user to put three numbers that they choose to input.
        System.out.print("Please put three numbers of your choosing: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    //This is the code that sorts out the numbers in order from least to greatest.
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double min = Math.min(num1, Math.min(num2, num3));
        double max = Math.max(num1, Math.max(num2, num3));
        double mid = num1 + num2 + num3 - min - max;

        System.out.println("These are the numbers that have been sorted: " + min + ", " + mid + ", " + max);
    }
}
