import java.util.Scanner;
// [4,3,5,6,7]
//[ 0,1,2,3,4] 
public class Minimum {
    public static void FindMinimum(int []arr,int n){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum value in array: " + min);

    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("give the array size");
    int n=sc.nextInt();
    int []arr=new int[n];
    System.out.println("enter array no.");
    // taking the array
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();//store the array no.in aar[i]
    }
    FindMinimum(arr, n);
  

    }
    
}
