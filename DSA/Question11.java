// import java.util.Scanner;

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
    int count=0;
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        if(n%i==0){
            count++;
        }
    }
    if(count==2){
        System.out.println("no.is prime");
    }
    else System.out.println("not prime");

}
    }
            
            
            
            
    

