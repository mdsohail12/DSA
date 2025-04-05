import java.util.Scanner;

public class Mmm {
    public static void print(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
         sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
        sc.close();
    }
    
}
