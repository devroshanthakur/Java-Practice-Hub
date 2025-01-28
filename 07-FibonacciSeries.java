import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms (N): ");
        int N = scanner.nextInt();

        // Print the Fibonacci series
        System.out.println("Fibonacci series up to " + N + " terms:");

        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= N; i++) {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        // Close the scanner
        scanner.close();
    }
}