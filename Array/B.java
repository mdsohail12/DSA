import java.util.ArrayList;

public class B {
    public static void main(String[] args) {
        ArrayList<String>cities=new ArrayList<>();
        cities.add("bhopal");
        System.out.println(cities);

        cities.add(0,"indore");
        System.out.println(cities);
        cities.add(0,"Mp");
        System.out.println(cities);

    }
    
}
