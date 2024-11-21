import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //This print asks for the month and year that the user wants to input, and lets them             input it.
        System.out.print("Enter your given month from 1 to 12: ");
        int month = input.nextInt();
        System.out.print("Enter your given year: ");
        int year = input.nextInt();

        int days;

        //This code checks if there is a leap year.
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // This code is the "equation" that calculates the number of days in the given months             inputted by the user. It also takes itno account the year.
        if (month == 2) {
            days = isLeapYear ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else {
            days = 31;
        }

        //This print takes the result of the equation and prints it out for the user to see.
        System.out.println("Number of days: " + days);
    }
}