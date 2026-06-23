package Dubai;

import java.util.Arrays;
import java.util.Scanner;

public class arrsorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("before sorted"+Arrays.toString(arr));

       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int tempt=arr[i];
                arr[i]=arr[j];
                arr[j]=tempt;
            }
        }
       }
        System.out.println("after sorted "+Arrays.toString(arr));

        sc.close();


    }
    
}
