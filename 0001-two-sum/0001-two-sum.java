class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // Start from i + 1 to ensure i != j
                if (nums[i] + nums[j] == target) { // Check if the sum matches the target
                    return new int[]{i, j}; // Return the indices
                }
            }
        }
        // No need to handle "no solution" since one is guaranteed
        return null; // This line won't be reached if a solution always exists
    }
}
