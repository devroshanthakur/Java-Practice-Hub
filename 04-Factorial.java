class Factorial {

    public static void main(String[] args) {

        int num = 0;
        int f = 1;
        int i = 1;

        while (i <= num) {
            f = f * i;
            i++;
        }

        System.out.println("The factorial of " + num + " is: " + f );
    }
}
