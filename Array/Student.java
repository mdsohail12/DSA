import java.util.Scanner;

public class Student {
    // static int a;
    // public void show(){
    //     System.out.println(a);
    // }
    public static void main(String[] args) {
        // Student s=new Student();
        // s.show();
        Scanner sc=new Scanner(System.in);
        System.out.println("entered how many digit you want to add");
        int n=sc.nextInt();
        int sum=0;
        // for(int i=0;i<n;i++){
        //     int a=sc.nextInt();
        //     sum=sum+a;
        //     if(a<0) break;
        // }
        for(; ;){
            n=sc.nextInt();
            if(n==0) break;
          sum=sum+n;
        }
        System.out.println(sum);
    
}
    
}
