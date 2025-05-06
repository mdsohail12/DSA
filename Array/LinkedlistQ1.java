import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedlistQ1 {
    public static void main(String[] args) {
        LinkedList <String> month=new LinkedList<>();
        // Adding the data
        month.add("APR");
        month.add("JAN");
        month.add("Feb");
        System.out.println(month);
        // Sorting the data
        System.out.println("Before Swapping the data");
        for(String s:month){
            System.out.println(s);
        }
   Collections.sort(month);

    System.out.println("After swappin  data");
    for(String s:month){
        System.out.println(s);
    }


    }
    
}
