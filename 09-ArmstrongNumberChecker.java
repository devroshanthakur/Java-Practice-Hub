import java.util.Scanner;

class ArmstrongNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length(); // Get the number of digits

        // Calculate the sum of digits raised to the power of numberOfDigits
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += Math.pow(digit, numberOfDigits); // Add the digit raised to the power of numberOfDigits
            number /= 10; // Remove the last digit
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }
}