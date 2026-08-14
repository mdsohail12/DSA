package Dubai;

import java.util.Scanner;

public class Student {
//     int age;
// char grade;
// double per;
//there is drawback of this code encapsulation rull not follow
    private int roll;
    // private char grade;
    private String name;
    private double per;

    public void setData(){
        //step1
        // age=10;
        // grade='A';
        // per=76.9;
        //now step2 take input from the user in entity class this is not good ok
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age,name, per");
         roll=sc.nextInt();
         name=sc.next();
         per=sc.nextDouble();
       

    }
    public void getData(){
    //    System.out.println(age + ","+grade +","+per);
       System.out.println("Roll="+roll+",Name="+name+",percentage="+per);
        
    }
    
}
