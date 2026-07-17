public class evenBinarySearch {
    public static void main(String[] args) {
        int []arr={1,3,5,7,8,10};
        int left=0;
        int answer=-1;
        int right=arr.length-1;
        System.out.println(right);
        while (left<=right) {
            int mid=(left+(right-left)/2);
            if(arr[mid]%2==0){
                answer=mid;//may posiblee first even
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        if(answer!=-1){
             System.out.println("Index = " + answer);
            System.out.println("Value = " + arr[answer]);
        }else{
             System.out.println("No Even Number Found");
        }
    }
    
}
