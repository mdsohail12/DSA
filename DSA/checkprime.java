package DSA;

import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for( i=2;i<=a-1;i++){
            if(a%i==0)
                break;
        }
        if(a==i) System.out.println("it is prime"); 
        else System.out.println("not prime");
// sc.close();
      
    }
}