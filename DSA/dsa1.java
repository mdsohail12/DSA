package DSA;

import java.util.Scanner;

public class dsa1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        if((input>>1)<<1==input){
            System.out.println("even");
        }else System.out.println("odd");
        sc.close();
    }
}
