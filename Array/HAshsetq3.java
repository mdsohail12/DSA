import java.util.HashSet;

public class HAshsetq3 {
    public static void main(String[] args) {
        // Ex-This example demonstrates how HashSet stores unique element and does not maintain any insertion order.
        // HashSet<String>s=new HashSet<>();
        // s.add("B");
        // s.add("B");
        // s.add("C");
        // s.add("A");
        // System.out.println(s);

        // Example: This example demonstrates how to check if a specified element exists or not using the contains() method./
         HashSet<String>s=new HashSet<>();
        s.add("B");
        s.add("B");
        s.add("C");
        s.add("A");
        System.out.println("The List is "+s);
        String h="D";
        s.remove("B");
        System.out.println(s);
        System.out.println("check d is present or not "+s.contains(h));


    }
    
}
