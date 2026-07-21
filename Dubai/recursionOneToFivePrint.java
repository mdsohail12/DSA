public class recursionOneToFivePrint {
    public static void check(int n){
        if(n==101){
            return;
        }
        System.out.println(n);
        check(n+1);
    }

    public static void main(String[] args) {
        check(1);
        
    }
    
}
