import java.util.Arrays;
import java.util.Scanner;

public class Bitts {
    // Method to convert a number into binary bits array
    public static int[] getBits(int num) {
        // Maximum bits in an integer (32-bit representation)
        int[] bits = new int[32];
        int index = 0;

        // Extract bits using modulo and division
        while (num > 0) {
            bits[index++] = num % 2;  // Store remainder (0 or 1)
            num /= 2;                 // Divide number by 2
        }

        // Reverse the array to get the correct binary order
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = bits[index - i - 1];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        // Convert number to binary bits
        int[] binaryBits = getBits(num);

        // Print the binary representation
        System.out.println("Binary representation: " + Arrays.toString(binaryBits));
    }
}
