// import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //         int first=0,second=1;
    //            System.out.println("Fibonacci Series up to " + n + " terms:");

    //     for (int i = 1; i <= n; i++) {
    //             System.out.println(first + " ");
    //             int next=first+second;
    //               first = second;            
    //               second = next;  
    //         }

//   System.out.print("Enter gender (male/female): ");
//         String gender = sc.nextLine();

//         System.out.print("Enter marital status (married/unmarried): ");
//         String status = sc.nextLine();

//         System.out.print("Enter age: ");
//         int age = sc.nextInt();
//         sc.nextLine();
   
//     if(status.equalsIgnoreCase("married")){
//         System.out.println("given");
//     }
//     else if(gender.equalsIgnoreCase("unmarried")&&age>35){
//         System.out.println("given insurence");
//     }
//     else if(gender.equalsIgnoreCase("unmarried")&&age>30){
//         System.out.println("given");
//     }
//     else System.out.println("not given");

// int month=sc.nextInt();

// switch (month) {
//     case 1: case 2: case 11: case 12:System.out.println("winter");
//     break;
//     case 3:case 4: case 5: case 6:System.out.println("summer");
//     break;
//     case 7:case 8:case 9:case 10:System.out.println("Rainy");
//     break;
//     default:System.out.println("invalid");
//         break;
// System.out.println("which day you want to see");
// System.out.println("plz enter number 1 is sun and last day no.4");
// int month=sc.nextInt();

// switch (month) {
//     case 1:System.out.println("sun");
//     break;
//     case 2:System.out.println("monday");
//     break;
//     case 3:System.out.println("tue");
//     break;
//     case 4:System.out.println("wed");
        
//         break;

//     default:System.out.println("invalid");
//         break;
// int a=sc.nextInt();
// int b=(a>=0)?a:-a;
// System.out.println(Math.abs(a));

// int input=sc.nextInt();
// int sum=0;
// for(int i=0;i<=input;i++){
//     int digit=input%10;
//     sum+=digit;
//     input=input/10;
// }
// System.out.println(sum);

// System.out.println("plz enter your name/number");
// int n=sc.nextInt();
// // int digit=0;
// for(;n>0;n=n/10){
//    int digit=n%10;
// System.out.print(digit);
// }
// int n=123;
// while(n>0){
//     int digit=n%10;
//     System.err.print(digit);
//     n/=10;
// }
// String str=sc.nextLine();
// for(int i=str.length()-1;i>=0;i--){
//     char ch=str.charAt(i);
//     System.out.print(ch);
// }

// for(int i=68;i>=65;i--){
//     for(int j=i;j>=65;j--){
//         System.out.print((char)j);
//     }
//     System.out.println();
// }
// for(int i=1;i<=4;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

    //  sc.close();
    // System.out.println("hiii");

    // check prime number
    // int count=0;
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     if(n%i==0){
    //         count++;
    //     }
    // }
    // if(count==2){
    //     System.out.println("no.is prime");
    // }
    // else System.out.println("not prim");
    // int sum=0;
    // for(;;){
    //      System.out.print("Enter a number (0 to stop): ");
    //     int input=sc.nextInt();
    //     if(input==0){
    //         break;
    //     }
    //     sum=sum+input;
    //       System.out.println("Current sum: " + sum);
    // }
    //  System.out.println("Final sum: " + sum);

    // ist one is that 
    // int []arr=arr=new int [5];
    // arr[0]=20;
    // arr[1]=30;
    // System.out.println(arr[0]);
    // System.out.println(arr[1]);
    // arr[5]=50;
    // System.out.println(arr[5]);//this will give the eror
// System.out.println("Enter array size");
// int n=sc.nextInt();
//     int []arr=new int [n];
//     int sum=0;
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }
//     for(int i=0;i<n;i++){
//        sum=sum+arr[i];
//     }
//         System.out.println(Arrays.toString(arr));
//         System.out.println(sum);
//         System.out.println("Avg is"+(double)sum/n);
        //    int []arr={1,0,3};
        //    int n=arr.length;
        //    int current_sum=0;
        // //    int total_sum=0;
        //   int total_sum=n*(n+1)/2;
        //    for(int x:arr){
        //     current_sum=current_sum+x;
        //    }
        //    int miss=total_sum-current_sum;
        //       System.out.print("Array with missing number: [");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + ", ");
        // }
        //    System.out.println(miss+"]");

        // find the sum of array in the elemnt
        // taking array size like [1,2,3,4,5]
        // int n=sc.nextInt();
        // int arr[]=new int [n];
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        //     sum=sum+arr[i];
        // }
        // System.out.println("sum of array is "+sum);

        // find min and mx in array
        // int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;
        // int []arr={5, 1, 8, 2};
        // for(int x:arr){
        //     if(x>max){
        //         max=x;
        //     }
        //     if(x<min){
        //         min=x;
        //     }
        // }
        // System.out.println(max+"max h");
        // System.out.println(min+"min h");


        // count even or odd array
        // int []arr={2, 5, 7, 8};
        // int even=0;
        // int odd=0;
        // for(int x:arr){
        //     if(x%2==0){
        //         even++;
        //     }
        //     else{
        //         odd++;
        //     }
        // }
        // System.out.println("even is "+even+" odd is "+odd);

        // reverse array without using any extra array
        // int []arr={1, 2, 3, 4};
        // int temp=0;
        // int start=0;
        // int end=arr.length-1;
        // while (start<end) {
        //     temp=arr[start];
        //     arr[start]=arr[end];
        //     arr[end]=temp;
        // }
        // System.out.println("reversed array");
        // for(int x:arr){
        //      System.out.print(x + " ");
        // }

        // 2nd approach
        // int []arr={1, 2, 3, 4};
        // System.out.println("Original array: " + Arrays.toString(arr));
        // int n=arr.length;
        // int temp=0;
        // for(int i=0;i<n/2;i++){
        //     temp=arr[i];
        //     arr[i]=arr[n-i-1];
        //     arr[n-i-1]=temp;
        // }
        // System.out.println("Reversed array: ");
        // for (int i : arr) {
        //     System.out.println(i+" ");
        // }

        //  System.out.println("Reversed array: " + Arrays.toString(arr));

        // largest number

        //  int []arr={5, 1, 8, 2};
        //  int minimum=Integer.MAX_VALUE;
        //  for(int i=0;i<arr.length;i++){
        //     if(minimum>arr[i]){
        //         minimum=arr[i];
        //     }
        //  }
        //  System.out.println(minimum);
        //  int []arr={5, 1, 8, 2};
        //  int maximum=Integer.MIN_VALUE;
        //  for(int i=0;i<arr.length;i++){
        //     if(maximum<arr[i]){
        //         maximum=arr[i];
        //     }
        //  }
        //  System.out.println(maximum);

        // Find the second largest number in an array.
//         int []arr={5, 9, 2, 7};
//         int max = Integer.MIN_VALUE;
//         int secondMax = Integer.MIN_VALUE;
//         for (int x: arr) {
//             if(x>max){
//                 secondMax=max;
//                 max=x;
//             }
//             else if(x>secondMax&&x<max) {
//                 secondMax=x;
//             }  
//         }
//         System.out.println("Largest: " + max);
// System.out.println("Second Largest: " + secondMax);
// System.out.println("Second Largest: i got with some logic");

// Count duplicate elements in an array.
// 👉 Example: {1, 2, 3, 2, 4, 1} → Duplicates = 1 and 2
int []arr={1, 2, 3, 2, 4, 1};
int count=0;
for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
            count++;
             System.out.println("Duplicate found: " + arr[i]);
        }
    }

}

        System.out.println("Total duplicates: " + count);




}
    }
            
            
            
            
    

