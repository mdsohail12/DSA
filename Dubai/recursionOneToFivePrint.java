public class recursionOneToFivePrint {
    public static void check(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        n--;
        check(n);
        // check(n+1);

    }

    public static void main(String[] args) {
        check(10);
        
    }
    
}
