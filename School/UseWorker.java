package School;

import java.util.Scanner;

public class UseWorker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // create obj
        Worker s=new Worker();
        int h=sc.nextInt();
        double p=sc.nextDouble();
        s.setData(h,p);
     
        double a= s.calculateSalary();
        System.out.println(a);
        sc.close();

    }
    
}
