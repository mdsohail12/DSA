package Dubai;

import java.util.Scanner;

public class arrduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("the duplicate no is present index of "+i+" and the duplicate mo is "+arr[i]);
                }
            }
        } 



    }
    
}
