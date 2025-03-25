import java.util.Scanner;

public class Qutient {
    // Method to divide two numbers
    public int divide(int dividend, int divisor) {
        return dividend / divisor; // Direct return quotient
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        // Creating object of Qutient class
        Qutient obj = new Qutient();
        int quotient = obj.divide(dividend, divisor);

        // Printing result
        System.out.println(quotient);

        // Closing scanner
        sc.close();
    }
}
