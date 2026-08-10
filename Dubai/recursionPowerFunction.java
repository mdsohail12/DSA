package Dubai;

public class recursionPowerFunction {
    public static int powerFunction(int base,int exponent){
        if(exponent==0){
            return 1;
        }
        return base * powerFunction(base,exponent-1);
    }
    public static void main(String[] args) {
        int base=2;
        int exponent=5;
        int result=powerFunction(base,exponent);
        System.out.println(base + " raised to the power of "+ exponent +" is "+result);
        
    }
    
}
