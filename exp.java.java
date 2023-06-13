public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the series

        // First two terms of the series
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series:");

        // Loop to generate the series
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            // Computing the next term in the series
            int nextTerm = firstTerm + secondTerm;

            // Updating the values of firstTerm and secondTerm
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}