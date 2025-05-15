// import java.util.HashMap;

// public class Hashmapq2 {
//     public static void main(String[] args) {
//         HashMap<Integer,Integer>h=new HashMap<>();
//         h.put(1,10);
//         // h.put(2,1);

//         if(h.containsKey(2)){
//             h.put(2,h.get(2)+1);
//         }

//         else{
//             h.put(2,1);
//         }
//         System.out.println(h);
//     }
    
// }



import java.util.*;

class Solution {
    
    // Function 1: Actual logic to count minimum swaps using cycle detection
    private int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];  // value
            arr[i][1] = i;        // original index
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][1] == i) continue;

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = arr[j][1];
                cycleSize++;
            }

            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }

    // Function 2: Wrapper function to call minSwaps
    public int total_swaps(int[] nums) {
        return minSwaps(nums);
    }
}

