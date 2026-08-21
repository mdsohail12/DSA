package Dubai;

import java.util.Scanner;

public class arrduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int [] arr = new int [n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        int []arr={1, 2, 3, 2, 4, 1};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    // i am checking by my self how many no. in duplicate i the array ok no need to check ok 
                    // count++;
                    System.out.println("the duplicate no is present index of "+i+" and the duplicate mo is "+arr[i]);
                }
            }
        }
                    System.out.println("the duplicate number in the array is  "+count);




    }
    
}
