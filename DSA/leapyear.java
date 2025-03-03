package DSA;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a leap year to check");
        int a=sc.nextInt();
        if((a%4==0 && a%100!=0) || (a%400==0)){
            System.out.println(a + " is a leap year. ");
        }else System.out.println(a + " is not leap year. ");

        sc.close();
    } 
}
