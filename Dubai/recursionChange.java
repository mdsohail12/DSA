public class recursionChange {
    public static void check(int n){
        if(n==6){
            return;
        }
        check(n+1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        check(1);
    }
    
}
