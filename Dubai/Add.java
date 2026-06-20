package Dubai;

import java.util.Arrays;
import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;

public class Add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int a=10,b=20;
        // int c=a+b;
        // System.out.println(a+b);

        // find the circum of ferrance circle ok
        // int rad=sc.nextInt();
        // double area=Math.PI*rad*rad;
        // double cirm=2*Math.PI*rad;
        // System.err.println("area is"+area+" "+"cirm is"+cirm);

        // find the hypotenus example
        // int perpendicular=5;
        // int base=5;
        // System.out.println("h="+Math.sqrt(Math.pow(perpendicular,2)+Math.pow(base,2)));

        // check odd or even no. from 1 to n
        // int a=sc.nextInt();
        // if(a%2==0){
        //     System.out.println("The Number Is Even");
        // }else System.out.println("The NUmber Is Odd");

        // Check company provides insurance or not according to folllowing criteria
        // int age=sc.nextInt();
    //     String gender=sc.next();
    //     String maritalStatus=sc.next();

    //      if(maritalStatus.equalsIgnoreCase("married")){
    //     System.out.println("got insurance");
    //    }

       
    //    else if(gender.equalsIgnoreCase("male") && age > 35){
    //     System.out.println("got insurance");
    //    }

    //    else if(gender.equalsIgnoreCase("female") && age > 30){
    //     System.out.println("got insurance");
    //    }

    //    else System.out.println("not given");


    // use switch statement
    // int month=12;
    // System.out.println("Enter a no. to choice summer");
    // int month=sc.nextInt();
    // switch (month) {
    //     case 1: case 2: case 11: case 12:
    //         System.out.println("Winter");
    //         break;
    //     case 3: case 4: case 5: case 6:
    //  System.out.println("Summer");
    //         break;
    //         case 7: case 8: case 9: case 10:
    //              System.out.println("Rainy");
    //         break;

    //     default:
    //         System.out.println("Wrong input");
    //         break;
    // }
   // int a=sc.nextInt();
  //     String result;
 //     result=(a%2==0)?("Even"):("Odd");
//     System.out.println(result);

// Using ternory operator abslute value find
// int a=sc.nextInt();
// // int b=sc.nextInt(
// int b;
// b=(a>0) ? a : -a;
// System.out.println(b);

// factorial program
// int f=1;
// int n=sc.nextInt();
// int n=5;
// while (n>1) {
//     f=f*n;
//     n--;
//     System.out.println(f);
// }
// System.out.println(f);

// System.out.println("Enter a no.");
// int a=sc.nextInt();
// int i;
// for( i=2;i<=a-1;i++){
//     if(a%i==0)
//         break;
// }
// if(a==i) System.out.println("no.is prime"); else System.out.println("no.is not prime");


// continue input ok and sum 
// int sum=0;
// int n;
// for( ; ; ){
//     n=sc.nextInt();
//     if(n==0) break;
//     sum+=n;
// }
// System.out.println(sum);

// for(int i=1;i<=10;i++){
//     System.out.println(i);
// }

// int f=1;
// int n=sc.nextInt();
// for(;n>1;n--){
//     f=f*n;
//     System.out.println(f);
// }
// System.out.println(f);

// int n=sc.nextInt();
// int sum=0;
// for(int i=0;i<=n;i++){
//    int  digit=n%10;
//     n=n/10;
//     sum=sum+digit;
// }
//     System.out.println(sum);


// String choice;
// do{
//     System.out.println("Enter a 2 no");
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     System.out.println("the sum of digit is"+(a+b));

//     System.out.println("do you want to again add no.(yes/no)");
//     choice=sc.next();
//      while (choice.equalsIgnoreCase("yes")){

//      };

// }


// print string reverse
// SOHAIL-->LIAHOS;
// System.out.println("enter a string");
// String str=sc.next();
// // for(int i=0;i<str.length();i++)
// for(int i=str.length()-1;i>=0;i--)
//     {
//     char ch=str.charAt(i);
//     System.out.println(ch);
// }

// star print
// System.out.println("Q1.Star print1str");
// for(int i=0;i<=4;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// System.out.println("Q2.Star reverse Print");
// for(int i=0;i<=4;i++){
//     for(int j=4;j>=i;j--){
//         System.out.print("*");
//     }
//     System.out.println();
// }


// System.out.println("Q3.Right Align triangle try to do mirore image");
// int n=4;
// // for row print
// for(int row=1;row<=n;row++){
//     // for spaces print
//     for(int space=1;space<n;space++){
//         System.out.print(" ");
//     }
//     // print star
//     for(int star=1;star<=row;star++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// // reverse Right Aling miror print
// System.out.println("Q4.reverse Right Aling miror print");
// for(int row=1;row<=4;row++){
//     for(int space=0;space<=row-1;space++){
//         System.out.print(" ");
//     }
//      for(int star=4;star>=row;star--){
//         System.out.print("*");
//     }
//     System.out.println();

// }
// System.out.println("Entered no. 1 for cofee and 2 for Tea ok");
// int choice=sc.nextInt();

// switch (choice) {
//     case 1:
//         System.out.println("i want to cofee");
        
//         break;
//     case 2:
//         System.out.println("i want to Tea");
        
//         break;

//     default:
//         System.out.println("Invalid Input");
//         break;
// }

// int i=1;
// while (i<=5) {
//     System.out.println(i);
//     i++;
// }
// System.out.println("you can write any of no. Multiplicatin just you want");
// int Multiplication=sc.nextInt();
// for(int i=1;i<=10;i++){
//     System.out.println(Multiplication+" * "+i+"="+(Multiplication*i));
// }

// for(int i=0;i<=10;i++){
//     if(i==2){
//         continue;
//     }
//     if(i==4){
//         break;
//     }
//     System.out.println(i);
// } 


// int a=10;
// int b=20;
// System.out.println("Before swapping a="+a+" and b="+b);
// a=a+b;
// b=a-b;
// a=a-b;
// System.out.println("After swapping a="+a+" and b="+b);

// int number=sc.nextInt();
// if(number%2==0){
//     System.out.println("Number is even");
// }
// else{
//     System.out.println("NUmber is odd");
// }

// int number=sc.nextInt();
//  int rem=number%2; 
//  System.out.println(rem);

// double principalAmount=sc.nextDouble();
// double rateOfinterest=sc.nextDouble();
// double time=sc.nextDouble();
// double si=principalAmount*rateOfinterest*time/100;
// System.out.println(si);

// int number=sc.nextInt();
// if(number>0){
//     System.out.println(number+" number is Positive");
// } else if(number<0){
//     System.out.println(number+" number is Negative");
// }else System.out.println(number+" number is Zero");


// int a=sc.nextInt();
// int b=sc.nextInt();
// if(a>b){
//     System.out.println(a+"Is largest");
// }else System.out.println(b+"is largest");


// int a=sc.nextInt();
// int b=sc.nextInt();
// int c=sc.nextInt();
// if(a>b&&a>c){
//     System.out.println(a+"Is largest");
// }else if(b>a&&b>c){
//     System.out.println(b+"is largest");
// }else System.out.println(c+" c is largest"); 

// int num=123;
// System.out.println(num+" before rev num");
// while (num!=0) {
//     int rev=num%10;
//     System.out.print(rev);
//     num=num/10;
// }
// int num=123;
// int count=0;
// System.out.println(num+" before rev num");
// while (num!=0) {
//     count++;
//     num=num/10;
// }
//     System.out.print(count);

// int age=sc.nextInt();
// if(age>=18){
//     System.out.println("You are eleigible for vote");
// }else System.out.println("NOt Eligible for vote");
// int leapYear=sc.nextInt();
// if(leapYear%4==0){
//     System.out.println("You are eleigible for vote");
// }else System.out.println("NOt Eligible for vote");


// int num=sc.nextInt();
// if(num<0){
// System.out.println("factprial not define for negative no.");
// }else{
// int fact=1;
// while (num!=0) {
//     fact=fact*num;
//     num--;
// }
// System.out.println(fact);
// }

// int num=sc.nextInt();
// int count=0;
// for(int i=1;i<=num;i++){
// if(num%i==0){
// count++;
// }}
// if(count==2){
//     System.out.println("prime");
// }else{
//     System.out.println("not prime");
// }


// System.out.println("Reverse Srtring");
// String str=sc.nextLine();
// String rev=" ";
// for(int i=str.length()-1;i>=0;i--){
//     rev=rev+str.charAt(i);
// }
// System.out.println(rev);

// String name="Sohail";
// for(int i=0;i<name.length();i++){
//     System.out.print(name.charAt(i));
//     System.out.println(" i have pushed all code on git hub");
// }

// Find the sum of first N natural numbers.

// int natural=sc.nextInt();
// int sum=0;
// for(int i=0;i<=natural;i++){
//     sum=sum+i;
// }
// System.out.println("sum of natural no. is "+sum);

// int multiplication=sc.nextInt();
// for(int i=1;i<=10;i++){
// System.out.println(multiplication+"*"+i + "="+multiplication*i);

// }
// count number digit
// int number=sc.nextInt();
// int count=0;
// while(number != 0){
//     // int count=digit%10;
//     number=number/10;
//     count++;
// }
//     System.out.println(count);

// int n=sc.nextInt();
// boolean isprime=true;
// if(n<=1){
//      isprime=false;
// }else{
//     for(int i=2;i<n;i++){
//         if(n%i==0){
//             isprime=false;
//             break;
//         }
//     }
// }
// if(isprime){
//     System.out.println("prime number");
// }else System.out.println("not prime");

// for(int num=2;num<=100;num++){
//     boolean isPrime=true;
//     for(int i=2;i<=num/2;i++){
//         if(num%i==0){
//             isPrime=false;
//             break;
//         }
//     }
//     if(isPrime){
//         System.out.println(num+" no is prime");
//     }

// }


// convert uppercase to lowercase

// String name="SOHAIL";
// System.out.println("i have changed lower to upper"+name.toLowerCase());

// String name="Sohail";
// String str="";
// for(int i=name.length()-1;i>=0;i--){
//     str=str+name.charAt(i);
// }
//     System.out.println(str);

// check palindrom
// String name="madam";
// String name=sc.nextLine();
// String str="";
// for(int i=name.length()-1;i>=0;i--){
// str=str+name.charAt(i);
// }
// if(name.equals(str)){
//     System.out.println(name+" is palindrom");
// }else{
//     System.out.println(name+" is not palindrom");

// }


// int number=121;
// int original=number;
// int rev=0;
// while (number>0) {
//   int digit=number%10;
//   rev=rev*10+digit;
//   number=number/10;
// }
// if (original==rev) {
//     System.out.println(number+" is palindrom");
// }
// else System.out.println(number+" not palindrom");

// Find the vowel letter
// String name="Sohail";
// String str="";
// for(int i=0;i<name.length();i++){
//     char ch=name.charAt(i);
//         System.out.println(ch);
//     // System.out.println(name.charAt(i));

// }
// System.out.println("Reverse String");
//     for(int i=name.length()-1;i>=0;i--){
//         str=str+name.charAt(i);
// }
// System.out.println(str);

// char ch=sc.next().charAt(0);
// if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
//     System.out.println(ch+" is Vowel letter");
// }else{
//     System.out.println(ch+" Character is Consanant");
// }

// reverse number
// int n=sc.nextInt();
// int rev=0;
// while (n>0) {
//     rev=rev*10+n%10;
//     n=n/10;
// }
// System.out.println(rev);

// A palindrome number is a number that reads the same from left to right and right to left
// int number=121;
// int original=number;
// int rev=0;
// while (number>0) {
//      rev=rev*10+number%10;
//      number=number/10;
// }
// if(rev==original){
//     System.out.println("palindrom");
// }

// A palindrome string is a string that reads the same from both directions.
// String name="madam";
// String name=sc.nextLine();
// String rev="";
// String original=name;
// for(int i=name.length()-1;i>=0;i--){
//     rev=rev+name.charAt(i);
// }
// System.out.println(rev);
// if(original.equals(rev)){
// System.out.println(name+" String is palindrome");
// }else{
//     System.out.println(name+" String is not palindrome");
// }



// int a=sc.nextInt();
// int b=sc.nextInt();
// int c=sc.nextInt();
// if(a>b && a>c){
//     System.out.println(a+" a is big");
// }
// else if(b>a && b>c){
//     System.out.println(b+" b is big");
// }else{
//     System.out.println(c+" c is big");
// }

// int a=sc.nextInt();
// int b=sc.nextInt();
// if(a>b){
//     System.out.println(a+" a is big");
// }else{
//     System.out.println(b+" b is big");
// }

// String str = "sohail soaib tanweer";
// String [] word=str.split(" ");
// System.out.println("total word = "+word.length);
// 154<-->451

// int n=sc.nextInt();
// int sum=0;
// while (n>0) {
//     int digit=n%10;
//     sum=sum+digit;
//     n=n/10;
// }
// System.out.println(sum);

// int sum=0;
// for(; ;){
// System.out.println("Enter no. continue input 0 ");
//     int num=sc.nextInt();
//     if(num==0){
//       break;
//     }
//     sum=sum+num;
// }
// System.out.println(sum);


// sum of last and first digit like 2157<<2+7=9
// int n=sc.nextInt();
// int firstDigit=n%10;
// while (n>=10) {
//     n=n/10;
// }
// int lastDigit=n;
// int sum=firstDigit+lastDigit;
// System.out.println(sum);


// int num=sc.nextInt();
// int original=num;
// int tempt=num;
// int digits=0;
// // step 1st count digit 
// while (tempt>0) {
//     digits++;
//     tempt=tempt/10;
// }
// //step 2 sum of armstrong
// int sum=0;
//  tempt=num;
//  while (tempt>0) {
//     int digit=tempt%10;
//     sum+=Math.pow(digit, digits);
//     tempt=tempt/10;
//  }
// if(original==sum){
//     System.out.println(sum+" is armstrong number");
// }else{
//     System.out.println(sum+"is not armstrong");
// }

// int n=sc.nextInt();
// int a=0;
// int b=1;
// System.out.println(a+" "+b+" ");
//  for (int i = 2; i < n; i++) {
//             int c = a + b;
//             System.out.print(c + " ");
//             a = b;
//             b = c;
//         }




// int n=sc.nextInt();
// int a=0;
// int b=1;
// System.out.println("we have already "+a +" " +b+" ");
// for(int i=0;i<n;i++){
//     System.out.print(a + " ");
//     int c=a+b;
//     a=b;
//     b=c;
// }



// int num=sc.nextInt();
// int original=num;
// int tempt=num;
// int digits=0;
// // step 1
// while (tempt>0) {
//      digits++;
//      tempt=tempt/10;
// }
// // now step 2 find armstrong
// int sum=0;
// tempt=num;
// while (tempt>0) {
//     int digit=tempt%10;
//     sum+=Math.pow(digit, digits);
//     tempt=tempt/10;
// }

// if(sum==original){
//     System.out.println("armstrong");
// }else{
//     System.out.println("not armstrong");
// }
// System.out.println(digits);




// nOw Start Array start from ok
// for(int num:number){
//     System.out.println(numbers[num]);
// }

// int numbers[]={1,2,3};//array innitilization ok
// for(int num:numbers){
//     System.out.println(num);
// }

// for(int i=0;i<numbers.length;i++){
//     System.out.println(numbers[i]);
// }

// System.out.println("Enter Arrays Size");
// int n=sc.nextInt();
// int []arr=new int[n];
// System.out.println("Enter array value");
// for(int i=0;i<n;i++){
//     // System.out.println("Enter a number as u want");
//     arr[i]=sc.nextInt();
//     // System.out.println(Arrays.toString(arr));
// }
// int sum=0;
// for(int i=0;i<n;i++){
// sum=sum+arr[i];
// }
// System.out.println(Arrays.toString(arr)+"Array of length "+arr.length);
// System.out.println("sum is "+sum+" "+"avg is "+(double)sum/n);



// using enhanced for loop privious code chamge ok
// int sum=0;
// System.out.println("Enter array size");
// int n=sc.nextInt();
// int []arr=new int[n];
// System.out.println("Enter array no");
// for(int i = 0; i < arr.length; i++){
//     arr[i] = sc.nextInt();
// }
// for(int x:arr){
//     System.out.println(x);
//     sum=sum+x;
// }
// System.out.println("sum is "+sum+" Avg is "+(double)sum/n);


System.out.println("Enter array size");
int n=sc.nextInt();
int []arr=new int[n];
System.out.println("Enter array no");
for(int i = 0; i < arr.length; i++){
    arr[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("Even numbers are:");
for(int i = 0; i < n; i++){
    if(arr[i] % 2 == 0){
        System.out.println(arr[i]);
    }
}

    System.out.println("Odd numbers are:");
    for(int i = 0; i < n; i++){
    if(arr[i] % 2 != 0){
        System.out.println(arr[i]);
    }
}





// System.out.println("Nothing you have wrote in java console ok");2
        sc.close();
}}
