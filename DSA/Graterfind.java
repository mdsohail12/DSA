package DSA;

import java.util.Scanner;

public class Graterfind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>b) {
            System.out.println(a+"is greater then "+b);
        }
        else if (b>a) System.out.println(b+"greater than "+a);
else System.out.println("both are equal");
        sc.close();
    }
    
}
