import java.util.Scanner;

public class ff {
    public static int SumOfDigit(int a){
        if(a<0) return -1;
        int sum=0;
        while(a!=0){
            int digit=a%10;
            sum+=digit;
            a=a/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.");
        int input=sc.nextInt();
        int output=SumOfDigit(input);
        System.out.println("Sum of digit is "+output);
        
    }
    
}
