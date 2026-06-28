import java.util.Arrays;

public class Arrleftrotate {
    public static void main(String[] args) {
        System.out.println("we never left the coding i am taking a pledge");
        // we create array
        int []leftArray={1,2,3,4,5};
        int first=leftArray[0];
        // shift left by 1
        for(int i=0;i<leftArray.length-1;i++){
            leftArray[i]=leftArray[i+1];
        }
        // put first at end
        leftArray[leftArray.length-1]=first;

        System.out.println(Arrays.toString(leftArray));
    }
    
}
