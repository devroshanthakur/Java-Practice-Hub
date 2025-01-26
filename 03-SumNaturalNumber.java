import java.util.Scanner;

class SumNaturalNumber {

    public static void main(String[] args) {
        System.out.print("Please enter the number: ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int sum = 0;
        int i = 1;

        if (num <= 0) {
            System.out.println("Please enter a positive number!!!");
        } else {
            while (i <= num) {
                sum += i;
                i++;
            }
            System.out.println("The sum of natural numbers is: " + sum);
        }

        input.close();
    }
}
