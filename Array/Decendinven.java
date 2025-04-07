import java.util.Scanner;

public class Decendinven {
    public static void Even_print(int n){
        for(int i=n;i>=2;i--){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          Even_print(n);
        sc.close();
    }
    
}
