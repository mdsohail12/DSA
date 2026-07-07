package Dubai;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int left=0;
       int right=arr.length-1;
       int target =70;
       while(left<=right){
        int mid=(left+(right-left)/2);
        if(arr[mid]==target){
           System.out.println("Element found at index " + mid);
           break;
        }else if(arr[mid]>target){
            right=mid-1;
        }
        else{
            left=mid+1;
        }
       }

    }
    
}
