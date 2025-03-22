import java.util.Scanner;

public class DD {
    public static void findduplicate(int []arr,int size){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Dublicate"+arr[i]);
                    System.out.println("Achha se nhi h ye code "+arr[i]);
                    return;
                }
            }
        }
        System.out.println("No duplicate found");
        System.out.println("this code is not completely");

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
