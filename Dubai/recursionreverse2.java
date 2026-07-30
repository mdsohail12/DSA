package Dubai;

public class recursionreverse2 {
    // first count the digit ok
    public static int countDigit(int n){
        if(n==0){
        return 0;

        }
        return 1+countDigit(n/10);
    }
    // print the reverse number
    public static int printReverse(int n){
        if(n==0){
            return 0;
        }
         return (int)(n % 10 * Math.pow(10, countDigit(n/10)))+ printReverse(n/10);
        }
    public static void main(String[] args) {
        int n=123;
       System.out.println( printReverse(n));
    }
    
}
