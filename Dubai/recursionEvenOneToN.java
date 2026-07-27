package Dubai;

import Array.f;

public class recursionEvenOneToN {
    public static void findEven(int n){
        if(n==0){
            return;
        }
        if(n % 2 == 0){
            System.out.println(n);
        }
        findEven(n-1);
        
    }
    public static void main(String[] args) {
        findEven(10);
        
    }
    
}
