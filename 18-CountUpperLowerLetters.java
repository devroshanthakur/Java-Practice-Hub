import java.util.Scanner;

class CountUpperLowerLetters {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize counters for uppercase and lowercase letters
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is an uppercase letter
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            }
            // Check if the character is a lowercase letter
            else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            }
        }

        // Print the results
        System.out.println("Number of uppercase letters: " + upperCaseCount);
        System.out.println("Number of lowercase letters: " + lowerCaseCount);

        // Close the scanner
        scanner.close();
    }
}