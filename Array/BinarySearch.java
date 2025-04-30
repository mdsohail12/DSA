import java.util.Scanner;

public class BinarySearch {
    public int search(int []arr,int target){
        int low=0;int high=arr.length;int mid=0;
        while(low<=high){
             mid=(low+high)/2;
             if(target==arr[mid]){
                return mid;
             }
             if(target<arr[mid])
             high=mid-1;
             else
             low=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a target no.");
        int target=sc.nextInt();
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int []arr=new int [n];
        System.out.println("Enter " + n + " numbers:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       int result=obj.search(arr,target);
       System.out.println(result);
        sc.close();
    }
    
}
