public class Main {
    public static void main(String[] args) {
        final double CONVERSION_FACTOR = 1.609;

        //This is the code to print the line that goes above the list.
        System.out.println("-------------------------------------");

        //This is the code that spaces the headers of Miles and Kilometers properly.
        System.out.printf("%-15s%-15s%n", "Miles", "Kilometers");

        //This is the code that figures out the miles to kilometers conversion.
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * CONVERSION_FACTOR;
            //This spaces the numbers so that they are aligned with their headers.
            System.out.printf("%-15d%-15.3f%n", miles, kilometers);
        }

        //This is the line that goes below the entire list.
        System.out.println("---------------------------------------");
    }
}