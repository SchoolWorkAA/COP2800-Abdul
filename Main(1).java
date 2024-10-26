public class Main {
    public static int sumDigits(long n) {
        if (n < 0) {
            n = -n;
        }
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        //The code line below this is where you input your number to see the sum of them.
        long number = 12345; 
        int sum = sumDigits(number);
        System.out.println("Sum of digits in " + number + " is: " + sum);
    }
}