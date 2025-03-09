import java.util.Arrays;

public class Reversearray {
    public static void main(String[] args) {
        int []arr={7,8,3,1,2};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        // for(int i=0;i<arr.length;i++){
            // System.out.print(Arrays.toString(arr)+arr[i]+" ");
            System.out.print(Arrays.toString(arr));
        
        // }
    }
    
}
