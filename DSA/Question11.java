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

  System.out.print("Enter gender (male/female): ");
        String gender = sc.nextLine();

        System.out.print("Enter marital status (married/unmarried): ");
        String status = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
   
    if(status.equalsIgnoreCase("married")){
        System.out.println("given");
    }
    else if(gender.equalsIgnoreCase("unmarried")&&age>35){
        System.out.println("given insurence");
    }
    else if(gender.equalsIgnoreCase("unmarried")&&age>30){
        System.out.println("given");
    }
    else System.out.println("not given");


             sc.close();

    }
            
            
            
            
    
}
