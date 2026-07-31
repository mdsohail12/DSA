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

        // new reverse way to make for this recursive call
        public static int reverse(int n,int rev){
            if(n==0){
                return rev;
            }
            return reverse(n/10,rev*10+n%10);

        }
    public static void main(String[] args) {
        int n=123;
        int rev=0;
        // reverse(n,rev);
        System.out.println(reverse(n,rev));

    //    System.out.println( printReverse(n));
    }
    
}
