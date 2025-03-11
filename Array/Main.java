import java.util.Scanner;

public class Main {
    public static void print_pattern(int n) {
        // First row (Full row of stars)
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Lower part
        for (int i = 1; i < n; i++) {
            // Left side decreasing stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // Spaces in between
            for (int j = 1; j <= 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // Right side stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print_pattern(n);
        sc.close();
    }
}