import java.util.Scanner;

public class Countbits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    // Function to count number of '1' bits (Hamming Weight)
        int count = 0; // '1' bits count karne ke liye

        while (n != 0) { 
            if ((n & 1) == 1) { // Check if last bit is 1
                count++;
            }
            n = n >>> 1; // Right shift n (unsigned shift)
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int count= hammingWeight(n);
       System.out.println(count);
    }
}

