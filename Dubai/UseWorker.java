package Dubai;

import java.util.Scanner;

public class UseWorker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hw1=sc.nextInt();
        double rate=sc.nextDouble();
        Worker obj=new Worker();
        obj.setData(hw1,rate);
        


        sc.close();
    }
    
}
