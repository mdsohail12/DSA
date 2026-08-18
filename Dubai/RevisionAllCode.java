public class RevisionAllCode {

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        System.out.println("Alla Code Revision Start");
        // Question 1
        // int []arr={1, 2, 3, 4};
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum=sum+arr[i];
        // }
        // System.out.println("Total sum of array= "+sum);
// find the min value in the aray q2
        // int []arr={5, 1, 8, 2};
        // int min=Integer.max
        // int min=Integer.MAX_VALUE;
        // int min=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]<min){
        //         min=arr[i];
        //     }
        // }
        // System.out.println(min);

        //find the max value q3
        // int []arr={5, 1, 8, 2};
        // int min=Integer.MIN_VALUE;
        // int max=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]>min){
        //         min=arr[i];
        //     }
        // }
        // System.out.println(min);
//Find the missing number in the array
//         int [] arr={1, 0, 3};
//        int n=arr.length+1;
//        int arraySum=0;
//        int total=n*(n+1)/2;

//        for(int x:arr){
//         arraySum+=x;
//        }
//        int missing=total-arraySum;
//        System.out.println("mising no is "+ missing);

       int [] arr = {1,2,4,5};
        int n=arr.length+1;
        int arraySum=0;
        int totalSum=n*(n+1)/2;

        for(int x:arr){
            arraySum+=x;
        }
        int missing=totalSum-arraySum;
        System.out.println(missing+" is the  misiig no. in the array element");



    }
    
}
