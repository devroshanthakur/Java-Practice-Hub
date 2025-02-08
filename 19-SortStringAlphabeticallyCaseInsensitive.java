import java.util.Arrays;
import java.util.Scanner;

class SortStringAlphabeticallyCaseInsensitive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Sort the character array case-insensitively
        Arrays.sort(charArray);

        // Convert the sorted character array back to a string
        String sortedString = new String(charArray);

        System.out.println("Sorted string (case-insensitive): " + sortedString);

        scanner.close();
    }
}