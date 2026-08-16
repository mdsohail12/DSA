package Dubai;

import java.util.Scanner;

public class UseCircle {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int r=sc.nextInt();
        Circle c=new Circle();
        c.setRadius(r);
        c.getCalculateArea();
        c.getCalculateCircumference();
        sc.close();
        
        
    }
    
}
