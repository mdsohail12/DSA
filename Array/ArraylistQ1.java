import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistQ1 {
        public static void main(String[] args) {
        ArrayList <String> countries=new ArrayList<>();
        countries.add("USA");
        countries.add("India");
        countries.add("Brazil");
        countries.add("Russia");
        countries.add("Columbia");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.println("enter country name to search");
            String input=sc.nextLine();

            if(countries.contains(input)){
                int rank = countries.indexOf(input) + 1;
                System.out.println(input + " is ranked " + rank);
            }
            else{
                System.out.println("country not found");
            }
        }
        }
    
}
