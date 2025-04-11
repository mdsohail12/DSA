import java.util.Scanner;

public class Star1 {
    public static void Star_print(int n){
        for(int i=1;i<=n;i++){
              char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
                
            }
                System.out.println();

    }}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          Star_print(n);
        sc.close();

    }}
    

