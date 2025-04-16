package School;

import java.util.Scanner;

public class UseCircle {
    public static void main(String[] args) {
        Circle s=new Circle();
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        double a; double b;
        // this method with return tyep object
        s.setRadius(radius);
       a=s.calculateArea();
        b=s.calculateCircumFerence();
        System.err.println("area is "+a+"circumfrence is "+b);

        // this calling object without for retunr type methode ok
        // s.setRadius(radius);
        // s.calculateArea();
        // s.calculateCircumFerence();

        sc.close();
    }
    
}
