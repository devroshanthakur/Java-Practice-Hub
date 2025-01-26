import java.util.Scanner;

class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        String reversedString = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
