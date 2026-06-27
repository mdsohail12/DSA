import java.util.Arrays;
// import java.util.Scanner;

public class Arrmergetwoarray {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int []arr1={10,20,30};
        int [] arr2={40,50};
        int [] merge = new int [arr1.length + arr2.length];

        int k=0;

        // Copy arr1
        for(int i=0;i<arr1.length;i++){
            merge[k]=arr1[i];
            k++;
        }

        // Copy arr2
        for(int i=0;i<arr2.length;i++){
            merge[k]=arr2[i];
            k++;
        }
        System.out.println("merge of two array are "+Arrays.toString(merge));

    }
    
}
