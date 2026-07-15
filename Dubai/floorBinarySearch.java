public class floorBinarySearch {
    public static void main(String[] args) {
         int []arr = {10,20,30,40,50};//Insert Position = 2
    int target = 25;
    int left=0;
    int right=arr.length-1;
    System.out.println(right);
    int save=-1;
    while (left<=right) {
        int mid=(left+(right-left)/2);
        System.out.println(mid);
        if(arr[mid]==target){
            save=mid;
            break;
        }
        else if(arr[mid]<target){
            save=mid;
            left=mid+1;
        }
        else{
            right=mid-1;

        }
    }
    if(save!=-1){
        System.out.println(arr[save]);
    }else System.out.println("not find");
    

    }
    
}
