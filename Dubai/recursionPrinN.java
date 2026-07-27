package Dubai;

public class recursionPrinN {
    public static void printIncr(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
       printIncr(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printIncr(n);
    }
    
}
