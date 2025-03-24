class Solution {
    public int findFirstUnique(int[] nums) { // Function name corrected
        int unique = -1; // Agar koi unique element nahi mila, toh -1 return karega

        for (int i = 0; i < nums.length; i++) { // Har element ke liye loop
            boolean isUnique = true; // Assume karo ki current element unique hai

            for (int j = 0; j < nums.length; j++) { // Dusre elements ke sath compare karne ke liye loop
                if (i != j && nums[i] == nums[j]) { // Agar same element mila but i ≠ j, to unique nahi hai
                    isUnique = false;
                    break;
                }
            }

            if (isUnique==true) { // Agar unique raha to store kar lo
                unique = nums[i];
                break; // First unique element mil gaya, ab aage check karne ki zaroorat nahi
            }
        }
        return unique; // First unique element return karo
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 4, 2, 3, 6git, 2}; // Input array
        Solution sol = new Solution();
        int result = sol.findFirstUnique(nums); // Function call
        System.out.println("First unique element: " + result);
    }
}
