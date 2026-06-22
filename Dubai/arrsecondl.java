package Dubai;

import java.util.Scanner;

public class arrsecondl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int []arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int largest=Integer.MIN_VALUE;
        // int secondLargest=Integer.MIN_VALUE;
         
        // for(int i=0;i<n;i++){
        // int current=arr[i];
        //     if(current>largest){
        //         secondLargest=largest;
        //         largest=current;
        //     }else if(current > secondLargest && current != largest){
        //         secondLargest=current;
        //     }
        // }
        // System.out.println(largest+" this is largest ");
        // System.out.println(secondLargest+" this is secondlargest ");



int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int first=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int thirdLargest=Integer.MIN_VALUE;

         for(int i=0;i<n;i++){
        int current=arr[i];
            if(current>first){
                thirdLargest=secondLargest;
                secondLargest=first;
                first=current;
            }else if(current > thirdLargest && current != first && current!=secondLargest){
                thirdLargest=secondLargest;
                secondLargest=current;
            }
        }
        System.out.println(first+" this is largest ");
        System.out.println(secondLargest+" this is secondlargest ");
        System.out.println(thirdLargest+" this is third largest ");



        sc.close();
}
    
}
