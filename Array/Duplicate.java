import java.util.Arrays;
import java.util.Scanner;
// [1,2,1,2,3,4,4]
// 0 ,1,2,3,4,5,6
public class Duplicate {
    public static void findduplicate(int []arr,int size){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Dublicate"+arr[i]);
                    return;
                }
            }
        }
        System.out.println("No duplicate found");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        findduplicate(arr,size);
        // System.out.println(Arrays.toString(arr));
}
    
}
