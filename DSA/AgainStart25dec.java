public class AgainStart25dec {
    public static void main(String[] args) {
        // int []arr= {1,2,3,4,5};
        // int largestElement=arr[0];
        // for(int i=1;i<arr.length;i++){
        //         if(arr[i]>largestElement){
        //             largestElement=arr[i];
        //         }
        //     }
        //         System.out.println(largestElement);
        int []arr= {1,2,3,4,5};
        int smallestElement=arr[0];
        for(int i=1;i<arr.length;i++){
                if(arr[i]<smallestElement){
                    smallestElement=arr[i];
                }
            }
                System.out.println(smallestElement);
    }
    }
    

