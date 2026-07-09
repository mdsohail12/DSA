package Dubai;

public class lastOccurance {
    public static void main(String[] args) {
        int [] arr={10, 20, 20, 20, 30, 40};
        int target=20;
        int save=0;
        int left=0;
        int right=arr.length-1;
        // here we are checking arr length ok
        // System.out.println(right);
        while(left<=right){
            int mid=(left+(right-left)/2);
            // we are checking mid ok
            // int s=(0+(5-0)/2);
            // System.out.println(s);
            // System.out.println(mid);
            if(arr[mid]==target){
                save=mid;
                left=mid+1;
            }
            else if(arr[mid]<=target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println("last ocuurance at index "+save);
    }
    
}
