public class floorCiel {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};//Insert Position = 2
    int target = 25;
    int left=0;
    int right=arr.length-1;
    System.out.println(right);
    int save=0;
    while (left<=right) {
        int mid=(left+(right-left)/2);
        // System.out.println(mid);
        if(arr[mid]>=target){
            right=mid-1;
        }else if(arr[mid]<=target){
            save=mid;
            left=mid+1;
        }
    }
    System.out.println("the nearest floor index no. is "+save+" and nearsef f is "+arr[save]);
    } 
}
