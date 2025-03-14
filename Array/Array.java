
public class Array {
  
    public static void findSecondLargestSmallest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        // First pass to find largest and smallest
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE || secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second largest or second smallest element found.");
        } else {
            System.out.println("Second Largest: " + secondLargest);
            System.out.println("Second Smallest: " + secondSmallest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        findSecondLargestSmallest(arr);
    }
}
