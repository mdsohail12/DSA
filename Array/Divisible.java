import java.util.Scanner;
public class Divisible {
    public static void divisible(int n) {

        for(int i=1;i<=n;i++){
            if(i%5!=0){
                System.out.println(i);
        }
    }}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        divisible(n);
    }
    
}
