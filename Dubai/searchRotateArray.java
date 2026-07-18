public class searchRotateArray {
    public static void main(String[] args) {
        int []arr={40, 50, 60, 70, 10, 20, 30};
        int target=60;
        int left=0;
        int right=arr.length-1;
        int answer=-1;
        while (left<=right) {//start loop
            int mid=(left+(right-left)/2);
            if (arr[mid] == target){
                answer=mid;
            break;
        }
         // Left half is sorted
        if (arr[left] <= arr[mid]) {

            if (target >= arr[left] && target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        // Right half is sorted
        else {

            if (target > arr[mid] && target <= arr[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
    }
    
     }//end loop
     if(answer!=-1){
            System.out.println(answer+"and find which at index"+arr[answer]);
        }else{
            System.out.println("not found");
        }

}}
