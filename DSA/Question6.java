import java.util.Scanner;

public class Question6 {
     Scanner sc=new Scanner(System.in);
      double principal=sc.nextInt();
        double rate=sc.nextInt();
        double time=sc.nextInt();
        double si=principal*rate*time/100;
        System.out.println(si);
    
}
