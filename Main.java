import java.util.Scanner;

public class Main {

    //This is the code that figures out the array for the integers.
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    //This code will calculate the average amount of the double array.
    public static double average(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        //This code will make a print for the user to enter 10 double values.
        double[] values = new double[10];
        System.out.println("Enter 10 double values:");

        for (int i = 0; i < 10; i++) {
            values[i] = scanner.nextDouble();
        }

        double avg = average(values);

        //This code shows the averge of the values to the user in a print.
        System.out.println("The average of the entered values is: " + avg);

        scanner.close();
    }
}