import java.util.Scanner;

public class Burger {

    static int[] typesOfBurger(int X, int Y, int N, int R) {
        if (R < N * X) {
            return new int[]{-1};
        }

        // If we can buy all N premium burgers
        if (R >= N * Y) {
            return new int[]{0, N};
        }

        // Find max premium burgers we can buy
        int p = (R - N * X) / (Y - X);
        p = Math.min(N, p);  // p cannot be more than N

        // Calculate normal burgers
        int n = N - p;

        return new int[]{n, p};
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int X = kb.nextInt();
        int Y = kb.nextInt();
        int N = kb.nextInt();
        int R = kb.nextInt();
        kb.close();  // Scanner close karna achha practice hai

        // **FIX: Result ko print karo**
        int[] result = typesOfBurger(X, Y, N, R);
        
        // Print the array elements
        if (result.length == 1) {
            System.out.println(result[0]);  // -1 case ke liye
        } else {
            System.out.println(result[0] + " " + result[1]);
        }
    }
}
