import java.util.Arrays;

public class ArrRightrotate {
    public static void main(String[] args) {
        int [] rightArray={1,2,3,4,5};
        int last=rightArray[rightArray.length-1];

        for(int i=rightArray.length-1;i>0;i--){
            rightArray[i]=rightArray[i-1];
        }
        rightArray[0]=last;
        System.out.println(Arrays.toString(rightArray));

    }
    
}
