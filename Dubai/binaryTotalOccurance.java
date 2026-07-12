public class binaryTotalOccurance {
    public static void main(String[] args) {
        int []arr={10, 20, 20, 20, 30, 40};
        int target=20;
        int save=-1;
        int left=0;
        int right=arr.length-1;
        // System.out.println(right);//5
        while (left<=right) {
            int mid=(left+(right-left)/2);
            // System.out.println(mid);
            if(arr[mid]==target){
                save=mid;
                right=mid-1;
            }
            else if(arr[mid]>=target){
                left=mid+1;
            }
            else{
                left=mid+1;
            }
        }
            System.out.println("First occurance is "+save);

            // starrt find last occurance ok
            int []arr2={10, 20, 20, 20, 30, 40};
        int target2=20;
        int save2=-1;
        int left1=0;
        int right2=arr.length-1;
        // System.out.println(right);//5
        while (left1<=right2) {
            int mid=(left1+(right2-left1)/2);
            if(arr2[mid]==target2){
                save2=mid;
                left1=mid+1;
            }
             else if(arr2[mid]<=target2){
                left1=mid+1;
            }
            else{
                right2=mid-1;
            }
        }
            System.out.println("Last occurance is "+save2);
            int totallOcurance=save2-save+1;
            System.out.println("Total occurance in the arry is "+totallOcurance);



    }
    
}
