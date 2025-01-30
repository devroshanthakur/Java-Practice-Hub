// Question: Write a program to replace all occurrences of a character in a string.

public class ReplaceCharacterInString {
    public static void main(String[] args) {
        // Input string
        String inputString = "Hello, World!";

        // Character to be replaced
        char oldChar = 'o';

        // Character to replace with
        char newChar = 'x';

        // Replace all occurrences of the character
        String resultString = inputString.replace(oldChar, newChar);

        // Output the result
        System.out.println("Original String: " + inputString);
        System.out.println("String after replacement: " + resultString);
    }
}