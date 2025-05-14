import java.util.HashMap;

public class Hashmapq2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer>h=new HashMap<>();
        h.put(1,10);
        // h.put(2,1);

        if(h.containsKey(2)){
            h.put(2,h.get(2)+1);
        }

        else{
            h.put(2,1);
        }
        System.out.println(h);
    }
    
}
