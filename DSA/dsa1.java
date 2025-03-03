package DSA;

import java.util.Scanner;

public class dsa1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        // if(input%2==0)ye bhi likh sakte h 
        if((input>>1)<<1==input)//ye >>right shift se /2 ho rha  h << left shift se*2 ho rha h ok jo no. mila h usse  
        {
            System.out.println("even");
        }else System.out.println("odd");
        sc.close();
    }
}
