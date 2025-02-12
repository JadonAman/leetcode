class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n];

        int pointer = 0;

        for (int i = n - k; i < n; i++) {
            temp[pointer++] = nums[i];
        }

        for (int i = 0; i < n - k; i++) {
            temp[pointer++] = nums[i];
        }

        System.arraycopy(temp, 0, nums, 0, n);
    }
}
