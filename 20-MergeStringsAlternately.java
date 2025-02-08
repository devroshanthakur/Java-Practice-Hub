class MergeStringsAlternately {

    // Method to merge two strings in alternating fashion
    public static String mergeStrings(String s1, String s2) {
        StringBuilder merged = new StringBuilder();
        int maxLength = Math.max(s1.length(), s2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < s1.length()) {
                merged.append(s1.charAt(i));
            }
            if (i < s2.length()) {
                merged.append(s2.charAt(i));
            }
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        // Example test cases
        String s1 = "abc";
        String s2 = "XYZW";

        String result = mergeStrings(s1, s2);
        System.out.println("Merged String: " + result);
        // Output: Merged String: aXbYcZW
    }
}
