package Dubai;

import java.util.Scanner;

public class Arrcountoddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int evenCount=0;
        System.out.println("Even no. here");

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" Even no.");
                evenCount++;
            }
        }
        System.out.println("Total Even no. is"+evenCount);

        int oddCount=0;
        System.out.println("Odd no. here");
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]+" odd no.");
               oddCount++;
            }
        }
        System.out.println("Total odd no. is"+oddCount);


    }
    
}
