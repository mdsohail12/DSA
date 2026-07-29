public class recursionReversetentoone {
    public static void check(int n){
        // prohram no1.for normal reverse
        if(n==0){
            return;
        }
        System.out.println(n);
        // n--;
        check(n);
        check(n-1);

    
        
        
    }
    public static void main(String[] args) {
        check(10);
    }
    
}
