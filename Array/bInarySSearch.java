public class bInarySSearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int l=0;int h=arr.length-1;int mid=0;int target=3;
        while (l<=h) {
            mid=(l+h)/2;
            if (arr[mid]==target) {
                System.out.println(mid);
            }
            if (target<arr[mid]) {
                h=mid-1;
                // System.out.println(h);
            }
            else{
                l=mid-l;
            }
        }
        System.out.println("hii");
    }
    
}
