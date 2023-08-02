import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int nod=0;
        int temp=n;
        while(temp !=0){
            temp=temp/10;
            nod++;
            // System.out.println(nod);
        }
        int div=(int)Math.pow(10,nod-1);
        while(div !=0){
            int q=n/div;
            System.out.println(q);

            n=n%10;
            div=div/10;
        }
    }
}
