package Dubai;

import java.util.Scanner;

public class UseStudent {
    public static void main(String[] args) {
        // Student s=new Student();
        // s.age=10;
        // s.grade='A';
        // s.per=76.9;
        //   System.out.println(s.age + ","+s.grade +","+s.per);
    //    In student class all data member by default in Default mood ok and this code fully violation of rull encapsulation and encapsulation says that we cant acces data out off tha class so if we want to acces this data we can use inside metho with getter and setter ok 
        // Student s1=new Student();
        // s1.setData();
        // Student p=new Student();
        // p.setData();
        // p.getData();
        // s1.getData();

        //now we will create scanner class for taking user input inside driver class
        Student s=new Student();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter roll name per");
        int r=sc.nextInt();
        String  n=sc.next();
        double p=sc.nextDouble();
        s.setData(r,n,p);
        s.getData();;
        sc.close();


    }
    
}
