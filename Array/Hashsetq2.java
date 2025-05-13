import java.util.Arrays;
import java.util.HashSet;

public class Hashsetq2 {
    public static void main(String[] args) {
        // Question 1.
        // creating the hashset
        // HashSet<String> hs=new HashSet<>();
        // ad the element
        // hs.add("sohail");
        // hs.add("sohail");
        // displaying the hashset
        // System.out.println("The hasset is"+hs);

         // Question 2.
        //  creating the 1st set class
        HashSet<Integer> a=new HashSet<>();
        a.addAll(Arrays.asList( new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
        

        HashSet<Integer>b=new HashSet<>();
        b.addAll(Arrays.asList(new Integer[]{1, 3, 7, 5, 4, 0, 7, 5 }));

        HashSet<Integer>u=new HashSet<>(a);
        u.addAll(b);
        System.out.println(u);

        // insertion
        HashSet<Integer> i=new HashSet<>(a);
        i.retainAll(b);
        System.out.print("Intersection of the two Set"+i);

        // differnt
         HashSet<Integer> d=new HashSet<>(a);
        d.removeAll(b);
        System.out.println("Different  of the two Set"+d);




    }
    
}
