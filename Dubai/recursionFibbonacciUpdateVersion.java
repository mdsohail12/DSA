package Dubai;

public class recursionFibbonacciUpdateVersion {
    // function 1
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+ fib(n-2);
    }
    // function 2
    public static void printseries(int currentIndex,int n){
        if(currentIndex > n){
            return;
        }
         System.out.println(fib(currentIndex));

        printseries(currentIndex + 1, n);
    }
    public static void main(String[] args) {
        printseries(0,4);

        // System.out.println(fib(4));
    }
    
}
