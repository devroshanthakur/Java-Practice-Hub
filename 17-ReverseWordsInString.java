// Question: Write a program to reverse the words in a string.

 class ReverseWordsInString {
    public static void main(String[] args) {
        // Input string
        String inputString = "Hello World! Java is fun";

        // Split the string into words using space as the delimiter
        String[] words = inputString.split(" ");

        // Create a StringBuilder to build the reversed string
        StringBuilder reversedString = new StringBuilder();

        // Iterate through the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }

        // Remove the trailing space and convert StringBuilder to String
        String result = reversedString.toString().trim();

        // Output the result
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed Words String: " + result);
    }
}
