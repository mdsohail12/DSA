package Dubai;

import java.util.Scanner;

public class UseWorker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        double p=sc.nextDouble();
        Worker obj=new Worker();
        obj.setData(h,p);
        double salary = obj.calculateSalary();

        System.out.println("Salary = " + salary);


        sc.close();
    }
    
}
