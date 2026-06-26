package Dubai;

import java.util.Scanner;

public class Arrywoarrayequal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Give the size of array 1");
        int n1=sc.nextInt();

        System.out.println("Give the size of array 2");
        int n2=sc.nextInt();

        int []arr1=new int [n1];
        int []arr2=new int [n2];

        System.out.println("store value for arr1");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("store value for arr2");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }

        boolean equal=true;
        // step 1st
        if(n1 != n2){
            equal=false;
        }else{
            // step 2 compare value
            for(int i=0;i<n1;i++){
                if(arr1[i]!=arr2[i]){
                    equal=false;
                    break;
                }
            }
        }
         if(equal){
                System.out.println("Both arrays are equal");
            }else {
                System.out.println("Both arrays are not equal");
            }
        


        sc.close();


    }}
    

