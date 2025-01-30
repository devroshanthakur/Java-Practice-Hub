// Question: Write a program to check if two strings are anagrams.

import java.util.Arrays;

 class AnagramChecker {
    public static void main(String[] args) {
        // Input strings
        String str1 = "listen";
        String str2 = "silent";

        // Check if the strings are anagrams
        boolean areAnagrams = checkAnagrams(str1, str2);

        // Output the result
        if (areAnagrams) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }

    // Method to check if two strings are anagrams
    public static boolean checkAnagrams(String str1, String str2) {
        // Remove all whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}