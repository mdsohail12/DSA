package Dubai;

import java.util.Scanner;

public class Arrmisingno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arraySize=sc.nextInt();
        int []arr=new int[arraySize];
        for(int i=0;i<arraySize;i++){
            arr[i]=sc.nextInt();
        }
        // int [] arr = {1,2,4,5};
        int n=arr.length+1;
        int arraySum=0;
        int totalSum=n*(n+1)/2;

        for(int x:arr){
            arraySum+=x;
        }
        int missing=totalSum-arraySum;
        System.out.println(missing+" is the  misiig no. in the array element");
        sc.close();

    }
    
}
