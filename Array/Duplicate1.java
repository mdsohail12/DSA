import java.util.Scanner;
// [5,3,2,3,2]
// [0,1,2,3,4]
public class Duplicate1 {
    public static int findDuplicate(int arr[],int n){
        
        for( int i=0;i<arr.length;i++){
            boolean isUnique=true;
            for(int j=0;j<arr.length;j++){
                if(i!=j&&arr[i]==arr[j]){
                    isUnique=false;
                }
            }
            if(isUnique) return arr[i];
        }
        return -1;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int a= findDuplicate(arr,n);
       System.out.println(a);
       sc.close();

        
    }
    
}
