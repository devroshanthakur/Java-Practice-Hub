import java.util.Scanner;

class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase to make comparison easier
        input = input.toLowerCase();

        int vowels = 0, consonants = 0;

        // Loop through each character in the string
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) { // Check if the character is a letter
                if (isVowel(c)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Display the results
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        scanner.close();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
