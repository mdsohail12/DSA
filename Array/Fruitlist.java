import java.util.ArrayList;
import java.util.Scanner;

public class Fruitlist {
    public static void main(String[] args) {
    ArrayList<String>fruits=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++){
        System.out.println("enter fruit name");
        String f=sc.next();
        fruits.add(f);
    }
    System.out.println("enter fruit delete you want"+fruits);
    System.out.println("enter fruit delete you want");
    String fruitname=sc.next();
   boolean result=fruits.remove(fruitname);
   if(result==true)
   System.out.println(fruitname+" remove");
else
   System.out.println(fruitname+" not remove");
   System.out.println(fruits);
   System.out.println("This is new fruit table");
  




    }
    
}
