package Dubai;

public class recursionreverse2 {
    public static int printReverse(int n){
        if(n==0){
            return 0;
        }
        return n%10*1000+printReverse(n/10);
    }
    public static void main(String[] args) {
        int n=123;
       System.out.println( printReverse(n));
    }
    
}
