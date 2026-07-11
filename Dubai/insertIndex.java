import java.util.Arrays;

public class insertIndex {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        int target=35;
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            int mid=(left+(right-left)/2);
            // System.out.println(mid);

            if(arr[mid]<=target){
                left=mid+1;
            }else{
                right=mid-1;
            }
              }
              System.out.println(left);
            } 
}
