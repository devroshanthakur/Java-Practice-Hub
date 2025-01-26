class PalindromeNumber {

    public static void main(String[] args) {

        int originalNumber = 131;
        int number = originalNumber;
        int reverseNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }

        if (originalNumber == reverseNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
