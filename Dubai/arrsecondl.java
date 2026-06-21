package Dubai;

import java.util.Scanner;

public class arrsecondl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
         
        for(int i=0;i<n;i++){
        int current=arr[i];
            if(current>largest){
                secondLargest=largest;
                largest=current;
            }else if(current > secondLargest && current != largest){
                secondLargest=current;
            }
        }
        System.out.println(largest+" this is largest ");
        System.out.println(secondLargest+" this is secondlargest ");
        sc.close();
}
    
}
