package Dubai;

import java.util.Scanner;

public class xx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // System.out.println("HEllo now i am again start bro ");
        
        // System.out.println("Shal we Start bro ");
        // for(int i=0;i<n;i++){
        //     System.out.println("yes");

        // }

        // String str1="madam";
        // String str2="";
        // for(int i=str1.length()-1;i>=0;i--){
        //    str2=str2+str1.charAt(i);
        //     }

            //this if block wrong answer because here is two address compare not
            //actual content ok bro thats why getting wrong answer ok bro 
        // if(str1==str2){
        //     System.out.println(str1+"  is palindron");
        // }else{
        //     System.out.println(str1+" is not palindrome ok");
        // }


        //  if(str1.equalsIgnoreCase(str2)){
        //     System.out.println("Palindrome");
        // }else System.out.println("Not Palindrome");
        // System.out.println("now we will continue from this date ok bro ");


        // how to find the evenSum and OddSum bro ok /
        // int []arr={2, 5, 7, 8};
//         int n=sc.nextInt();
//         int []arr=new int[n];
//         for(int i=0;i<n;i++){
//               arr[i] = sc.nextInt();
//         }

//         int evenSum=0;
//         int oddSum=0;
//         for(int i=0;i < arr.length;i++){
//             if(arr[i]%2==0){
//                 System.out.println(arr[i]+" is an even no.");
//                 evenSum++;
//             }else{
//                 System.out.println(arr[i]+" is odd no.");
//                 oddSum++;
//             }

//         }
//       System.out.println("Total even is " + evenSum);
//       System.out.println("Total odd is " + oddSum);
            //  int a=sc.nextInt();
            //  int b=sc.nextInt();
            //  System.out.println("Before Swapping a="+a+" And b="+b);
            // //  start  the logic from here
            // a=a+b;
            // b=a-b;
            // a=a-b;
            // System.out.println("After Swapping a="+a+" And B="+b);

            // find the odd or even
            // int a=sc.nextInt();
            // if(a%2==0){
            //     System.out.println(a+" is even no.");
            // }else{
            //     System.out.println(a+" is odd no.");
            // }
            //  int a=sc.nextInt();
            //  int b=sc.nextInt();

            // int rem=a%b;
            // System.out.println(rem);
            // double p=sc.nextDouble();
            //  double r=sc.nextDouble();
            //  double t=sc.nextDouble();
            //  double si=p*r*t/100;
            //  System.out.println("simple interest is "+si);

            //  int a=sc.nextInt();
            //  if(a>0){
            //     System.out.println("this is positive alue");
            //  }else if(a<0){
            //     System.out.println("neagtive no.");
            //  }else{
            //     System.out.println("this no. ia zero");
            //  }

            //  int a=sc.nextInt();
            //  int b=sc.nextInt();
            // //  int c=sc.nextInt();
            //  if(a>b){
            //     System.out.println("a is big");
            //  }
            //  else{
            //     System.out.println("b is greater");
            //  }
            //   int a=sc.nextInt();
            //  int b=sc.nextInt();
            //  int c=sc.nextInt();
            //  if(a>b&&a>c){
            //     System.out.println("a big");
            //  }else if(b>a&&b>c){
            //     System.out.println("b is big");
            //  }else{
            //     System.out.println("c is big");
            //  }

            // int persong=sc.nextInt();
             
            //  if(persong>=18){
            //     System.out.println("lisgible to vote");
            //  }else{
            //     System.out.println("not eleigible");
            //  }
            // int year=sc.nextInt();
            // if(year%400==0 || (year % 4 == 0 && year % 100 != 0)){
            //     System.out.println(year+"year is a leap year");
            // }else{
            //     System.out.println("not a leap year");
            // }
            // int n=sc.nextInt();
            // int  i=1;
            // while(i<=n){
            //     System.out.println(i);
            //     // n--;
            //     i++; 
            // }

            int n=sc.nextInt();
            int sum=0;
            while (n>=0) {
                sum+=n;
                n--;
            }
            System.out.println(sum);















        

        sc.close();

    }
    
}
