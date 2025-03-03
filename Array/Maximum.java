import java.util.Scanner;

public class Maximum {
    public static int find_maximum(int arr[],int length)
    {
       /*Function to find the maximum in the array 
          return the maximum value*/
          int max=arr[0];
          for(int i=0;i<arr.length;i++){
            
            if(arr[i]>max){
                max=arr[i];
            }
          }
          return max;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Length of the array: ");
            int n = sc.nextInt();
            int[] arr=new int [n];
             System.out.println("Enter " + n + " elements:");
             for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
        }
        int maxElement = find_maximum(arr, n);
        System.out.println("The maximum element in the array is: " + maxElement);



        }

    
}
