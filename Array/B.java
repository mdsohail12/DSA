import java.util.ArrayList;

public class B {
    public static void main(String[] args) {
        // ArrayList<String>cities=new ArrayList<>();
        // cities.add("bhopal");
        // System.out.println(cities);

        // cities.add(0,"indore");
        // System.out.println(cities);
        // cities.add(0,"Mp");
        // System.out.println(cities);
        // System.out.println(cities.size());

        ArrayList<String>Months=new ArrayList<>();
        Months.add("Jan");
        Months.add("Feb");
        Months.add("March");
        Months.add("April");
        // System.out.println(Months);

        // travers the arraylist
        for(String str:Months){
            System.out.println(str);
        }
        boolean found=Months.contains("Jan");
        System.out.println(found);
       
    


    }
    
}
