public class evenBinarySearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int left=0;
        int right=arr.length-1;
        System.out.println(right);
        while (left<=right) {
            int mid=(left+(right-left)/2);
            if(arr[mid]%2==0){
                System.out.println(arr[mid]);
            }
        }
    }
    
}
