package DSA;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        int num=sc.nextInt();
        int sum=0;
        int originalnumber=num;
        while (num!=0) {
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        System.out.println("the sum of digit "+originalnumber+" is "+sum);
sc.close();
    }
}
