class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int val= nums[nums.length-k];
        return val;
    }
}