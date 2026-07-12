package Dubai;

public class firstoccurance {
    public static void main(String[] args) {
        int [] arr={10, 20, 20, 20, 30, 40};
        int left=0;
        int right=arr.length-1;
        int target =20;
        int save=0;
        while(left<=right){
            int mid=(left+(right-left)/2);
            // System.out.println(mid);
           if(arr[mid]==target){
             save= mid;
            right=mid-1;
           }else if(arr[mid]>=target){
            left=mid+1;
           }
           else{
            left=mid+1;
           }
        }
            System.out.println("first Element occurance at index "+save);
    }
    
}
