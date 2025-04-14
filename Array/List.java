import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String>obj=new ArrayList<>();
        // obj.add("Sohail");
        // obj.add("Soaib");
        // obj.add("junaid Alam");
        // System.out.println(obj.get(0));
        // System.out.println(obj.get(1));
        // System.out.println(obj.get(2));
        // System.out.println(obj.size());
        // iterate the value
        // for(String Obj:obj){
        //     System.out.println(Obj);
        // }
        // how to find the value
        System.out.println(obj.contains("Soaib"));
        System.out.println(obj.contains("samsi"));
        System.out.println(obj.contains("junaid alam"));
        System.out.println(obj.indexOf("junaid Alam"));
        


    }
    
}
