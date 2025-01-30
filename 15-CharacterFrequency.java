// Question: Write a program to find the frequency of a character in a string.

public class CharacterFrequency {
    public static void main(String[] args) {
        // Input string
        String inputString = "programming";

        // Character to find the frequency of
        char targetChar = 'm';

        // Initialize a counter for frequency
        int frequency = 0;

        // Loop through the string to count occurrences of the character
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                frequency++;
            }
        }

        // Output the result
        System.out.println("The frequency of '" + targetChar + "' in the string is: " + frequency);
    }
}