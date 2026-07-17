public class decendingOrderBinarySearch {
    public static void main(String[] args) {
       int []arr= {90,80,70,60,50,40};
       int target = 40;//Return the index.
       int left=0;
       int right=arr.length-1;
    //    System.out.println(right);
       int save=-1;
       while (left<=right) {
        int mid=(left+(right-left)/2);
        // System.out.println(mid);
        if(arr[mid]==target){
            save=mid;
            break;
        }
        else if(arr[mid]>target){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
       }
       if(save!=-1){
               System.out.println("Target found at index "+save);   
       }else{
        System.out.println("not found");
       }

    }
    
}
