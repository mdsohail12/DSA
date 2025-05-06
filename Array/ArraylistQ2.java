import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistQ2 {
    public static void main(String[] args) {
    ArrayList <String> fruit=new ArrayList<>();
    fruit.add("mango");
    fruit.add("apple");
    fruit.add("banana");
    fruit.add("grapes");
    System.out.println(fruit);

    Scanner sc=new Scanner(System.in);
    System.out.println("you want to remove fruit in this list");
    String input=sc.nextLine();
    fruit.remove(input);
    System.out.println(fruit);
    // if(fruit.remove(input)){
    //     System.out.println(fruit);
    // }    
    }
    
}
