package Dubai;

import java.util.Scanner;

public class arrsecondl {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int []arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int []arr={5, 9, 2, 7};
        // int n=arr.length;
        // int largest=Integer.MIN_VALUE;
        //-2147483648 
        // System.out.println(largest);  
        // int secondLargest=Integer.MIN_VALUE;
        //  -2147483648
        // System.out.println(secondLargest); 
         
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

int []arr1={5, 9, 2, 7};
        int n1=arr1.length;
        int largest1=Integer.MIN_VALUE;
        int secondlargest1=Integer.MIN_VALUE;

        for(int i=0;i<n1;i++){
            int current1=arr1[i];
            if(current1>largest1){
                secondlargest1=largest1;
                largest1=current1;
            }
            else if(current1>secondlargest1 && current1!=largest1){
                secondlargest1=current1;
            }

        }
         System.out.println(largest1+" this is largest ");
        System.out.println(secondlargest1+" this is secondlargest ");


        int []arr={1, 2, 3, 2, 4, 1};
for(int i=0;i<arr.length;i++){
    for(int j=1;j<arr.length;j++){
        if(arr[i]==arr[j]){
            System.out.println("duplicate no."+arr[i]);
        }
    }
}









        // sc.close();
}
    
}
