package DSA;

import java.util.Scanner;

public class Greaterfind3no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b) System.out.println(a+"greater than"+b);
        else if (b>c) {
            System.out.println(b+"Greater than "+c);
        }
        else if (c>a) {
            System.out.println(c+"Greater than"+a);
        }
    }
}
