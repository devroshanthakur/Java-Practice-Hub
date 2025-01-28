import java.util.Scanner;

class SumOfDigits {
    /**
     * Calculate the sum of the digits of a number.
     * @param number Integer number (can be positive or negative)
     * @return Sum of the digits
     */
    public static int sumOfDigits(int number) {
        // Make sure the number is positive
        number = Math.abs(number);

        int sum = 0;

        // Extract digits and sum them
        while (number > 0) {
            sum += number % 10; // Add the last digit
            number /= 10; // Remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Calculate and display the result
        int result = sumOfDigits(num);
        System.out.println("The sum of the digits of " + num + " is " + result + ".");

        scanner.close();
    }
}
