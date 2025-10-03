import java.util.*;
public class Sohail {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

//       1 All add sub mul divi modulo code is here using two var
//        int a=kb.nextInt();
//        int b= kb.nextInt();
//        System.out.println("The Additiom is"+(a+b));
//        System.out.println("The Subtract is"+(a-b));
//        System.out.println("The Multiply is"+(a*b));
//        System.out.println("The Divide is"+(a/b));
//        System.out.println("The modulo is"+(a%b));

//      2 this program shows that how to calculate area of circle and cirm of circle:
//        int rad= kb.nextInt();
//        double ar=Math.PI*Math.pow(rad,2);
//        double cirm=2*Math.PI*rad;
//        System.out.println("For a circle with radius " + rad + ":");
//        System.out.println("Area is " + ar + " and Circumference is " + cirm);
//        System.out.println("Area is "+ar);
//        System.out.println("cirm is "+cirm);


//        3 this code shows how to calculate hyphotenus
//        int p=kb.nextInt();
//        int b= kb.nextInt();
//        double h=Math.sqrt(Math.pow(p,2)+ Math.pow(b,2));
//        System.out.println("Hyphotenus is "+h);
//        int h=kb.nextInt();
//        int b= kb.nextInt();
//        double p=Math.sqrt(Math.pow(h,2)- Math.pow(b,2));
//        System.out.println("p is "+p);


//        4 how to take insurance
//        String gender = kb.nextLine();
//        String status = kb.nextLine();
//        int age = kb.nextInt();
//        if (status.equalsIgnoreCase("married")) {
//            System.out.println("Insurance Given");
//        }
//        else if (gender.equalsIgnoreCase("male") && age > 35) {
//            System.out.println("Insurance Given");
//        }
//        else if (gender.equalsIgnoreCase("female") && age > 30) {
//            System.out.println("Insurance Given");
//        }
//        else {
//            System.out.println("not given");
//        }



//      5 how to check which one is weather is best
//        System.out.println("Enter you choice month");
//       int month= kb.nextInt();
//        switch(month) {
//            case 1:
//            case 2:
//            case 11:
//            case 12:
//                System.out.println("Winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Summer");
//                break;
//            case 7:
//            case 8:
//            case 9:
//            case 10:
//                System.out.println("rainy");
//                break;
//
//            default:
//                System.out.println("wrong input");

//     6 check absolute value
//        int a=kb.nextInt();
//       if(a>=0){
//           System.out.println(a);
//       }
//         else    System.out.println(-a);
//        int b=(a>=0)? a: -a;
//        System.out.println(b);

//        7 factorial no.
//        int f=1;
//        int n= kb.nextInt();
//        while (n>1){
//            f=f*n;
//            n--;
//        }
//        System.out.println(f);

//        how to check number is odd or even simple
//        int a= kb.nextInt();
//        if(a%2==0){
//            System.out.println("no.even");
//        }
//        else  System.out.println("no.odd");


//        calculate area of rectangle question no.7
//        int length= kb.nextInt();
//        int breath= kb.nextInt();
//        int rect=length*breath;
//        System.out.println(rect);

//        calculate volume of cuboid
//        int l= kb.nextInt();
//        int b= kb.nextInt();
//        int h= kb.nextInt();
//        int volume=l*b*h;
//        System.out.println("The volume is "+volume);

//        calculate simple interest
//        System.out.println("TEnter the principal amount");
//        int p= kb.nextInt();
//        System.out.println("TEnter the rate in percentage amount");
//        int r= kb.nextInt();
//        System.out.println("TEnter the time in a month/year amount");
//        int t= kb.nextInt();
//        int si=p*r*t/100;
//        System.out.println("The Simple interest is "+si);

//        calculate average of three number
//        int l= kb.nextInt();
//        int b= kb.nextInt();
//        int h= kb.nextInt();
//        int avg=l*b*h/3;
//        System.out.println("The average is "+avg);

//        swape two number using threee var
//        int a= kb.nextInt();
//        int b= kb.nextInt();
//        int c;
//        System.out.println("Befpre swapping a"+a);
//        System.out.println("Befpre swapping a"+b);
//        c=a;
//        a=b;
//        b=c;
//        System.out.println("After swapping a "+a);
//        System.out.println("after swapping a "+b);

//        swape two number using two var
//        int a= kb.nextInt();
//        int b= kb.nextInt();
//        System.out.println("Befpre swapping a "+a);
//        System.out.println("Befpre swapping b "+b);
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("After swapping a "+a);
//        System.out.println("After swapping b "+b);

//        print given number last digit
//        int a=123;
//           a=a%10;
//            System.out.println(a);
//    }
//    int a=123;
//    int n1=a/10;cls

//   System.out.println(n1);

//        System.out.println("Enter a number");
//        int a= kb.nextInt();
//        if(a>0){
//            System.out.println("Number is positive");
//        }
//        else         System.out.println("Non Positive10");

        System.out.println("Enter a number which you want to know number divisible by 5 or no");
        int a= kb.nextInt();
        if(a%5==0) System.out.println("Number is divisible");
        else System.out.println("not divisible");
    }}
