import java.util.ArrayList;
import java.util.Scanner;

public class Corona {
    public static void main(String[] args) {
        ArrayList<String>corona=new ArrayList<>();
        corona.add("America");
        corona.add("India");
        corona.add("Barzil");
        corona.add("Russia");
        corona.add("columbia");
        Scanner sc=new Scanner(System.in);
        System.out.println("now input the country name where heavy covide issue");
        String name=sc.next();
        int pos=corona.indexOf(name);
        if(pos!=-1)
        System.out.println("the rank"+(pos+1));
        else System.out.println("not foundsss");
       
        sc.close();
    }
    
}
