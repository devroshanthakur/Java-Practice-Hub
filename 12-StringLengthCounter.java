import java.util.Scanner;

class StringLengthCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int length = 0;

        // Iterate through the string character by character
        for (char c : input.toCharArray()) {
            length++;
        }

        // Display the result
        System.out.println("Length of the string: " + length);

        scanner.close();
    }
}
