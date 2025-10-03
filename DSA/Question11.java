import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            int first=0,second=1;
               System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
                System.out.println(first + " ");
                int next=first+second;
                  first = second;            
                  second = next;  
            }
             sc.close();

    }
            
            
            
            
    
}
