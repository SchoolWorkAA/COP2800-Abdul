import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //This code prompts the user to give 10 integers through a print.
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        //This code will print out the results after the duplicates have been eliminated.
        int[] distinctNumbers = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are: ");
        for (int number : distinctNumbers) {
            System.out.print(number + " ");
        }
    }

    //This code is a way eliminate the duplicates.
    public static int[] eliminateDuplicates(int[] list) {
        Set<Integer> set = new HashSet<>();
        for (int number : list) {
            set.add(number);
        }
      
        int[] result = new int[set.size()];
        int index = 0;
        for (int number : set) {
            result[index++] = number;
        }
        return result;
    }
}
