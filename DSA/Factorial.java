package DSA;

// import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int fact=1;
        // int n=sc.nextInt();
        // while (n>0) {
        //     fact=fact*n;
        //     n--;
        // }
        int[] arr= {1,5,4,6,7};
        int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if (max<arr[i])
        max=arr[i];

    } 
        System.out.println(max);
        // System.out.println(fact);
        // sc.close();
    }
    
}
