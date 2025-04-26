class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int right = 0;
        int left = 0;
        int mini = -1;
        int maxi = -1;
        long count = 0;
        int n = nums.length;
        
        while (right < n) {
            if (nums[right] < minK || nums[right] > maxK) {
                left = right + 1;
                right++;
                continue;
            }
            if (nums[right] == maxK) {
                maxi = right;
            }
            if (nums[right] == minK) {
                mini = right;
            }
            count += Math.max(Math.min(maxi, mini) - left + 1, 0);
            right++;
        }
        
        return count;
    }
}