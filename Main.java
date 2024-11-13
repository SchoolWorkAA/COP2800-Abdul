import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //This print asks for the user's weight in pounds.
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        //Then this print asks for the user's height converted to feet.
        System.out.print("Enter height - feet: ");
        int feet = input.nextInt();

        //This is the same print except it asks for the inches of their height.
        System.out.print("Enter height - inches: ");
        int inches = input.nextInt();

        //This code will convert the feet the user entered for height into inches.
        int totalInches = (feet * 12) + inches;

        //This code will convert the user's weight from pounds into kilograms.
        double weightInKilograms = weight * 0.45359237;

        //After that, this code will turn inches into meters.
        double heightInMeters = totalInches * 0.0254;

        //This is the code that has the equation to calculate the user's BMI.
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        //This code will print the result of the previous code to the user.
        System.out.printf("Your BMI is %.2f\n", bmi);

        //Finally, this code will figure out 
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 24.9)
            System.out.println("Normal weight");
        else if (bmi < 29.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

        input.close();
    }
}
