import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // This code makes a print that allows the users to input the subtotal first.
        
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        // This code makes a print that allows the users to input the gratuity rate second.
        // It also contains the equation to find it as well.
        
        System.out.print("Enter the gratuity rate: ");
        double gratuity = subtotal * input.nextDouble() / 100;

        //This code makes a print which shows what the gratuity is as well as the total.
        
        System.out.printf("The gratuity is $%.2f and total is $%.2f\n", gratuity, subtotal + gratuity);
    }
}
