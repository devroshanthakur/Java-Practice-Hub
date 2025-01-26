import java.util.Scanner; // Import Scanner class to take input from the user

class EvenOddChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = input.nextInt(); // Read the input number

        // Check if the number is even or odd
        if (num % 2 == 0) {
            System.out.println("Number " + num + " is even."); // Print if the number is even
        } else {
            System.out.println("Number " + num + " is odd."); // Print if the number is odd
        }

        input.close(); // Close the scanner to free resources
    }
}
