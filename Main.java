public class Main {

    public static void main(String[] args) {
        double tuition = 10000; //This is the first tuition given in the assignment desc.
        double rate = 0.05; //This is the 5 percent increase that is stated every year.
        int years = 10;

        //This will figure out the tuition in 10 years from now, with this equation.
        for (int i = 0; i < years; i++) {
            tuition += tuition * rate;
        }

        System.out.printf("Tuition after 10 years: $%.2f\n", tuition);

        //This will find out the total cost in about 10 years, with this equation.
        double totalCost = 0;
        for (int i = 0; i < 4; i++) {
            totalCost += tuition;
            tuition += tuition * rate; //THis increases the tuition by 5% every year.
        }

        System.out.printf("Total cost for 4 years after the 10th year: $%.2f\n", totalCost);
    }
}
