package Dubai;
import java.util.Arrays;
import java.util.Scanner;
public class Arrmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("we will take size of array");
        int n=sc.nextInt();
        System.out.println("we are creating array");
        int arr[]=new int[n];
        System.out.println("we are storing value in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            System.out.println(Arrays.toString(arr));

        // now find the max and min
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min+" Min value in array");
    }
    
}
