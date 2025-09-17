import java.util.Scanner;

public class A3 {
    public static void findMaximum(int arr[]){
         int largest = arr[0]; // Assume first element is the largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);

    }
    public static void main(String[] args) {
        // int a=60;
        // int b=50;
        // System.out.println(a*b);
        // taking input from user
        Scanner sc=new Scanner(System.in);
        // taking size of array
        int n=sc.nextInt();
        // taking array element
        int []arr=new int[n];
         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findMaximum(arr);
        }
    
}
