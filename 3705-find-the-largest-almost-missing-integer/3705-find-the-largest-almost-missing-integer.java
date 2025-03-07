class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[51];

        for (int i = 0; i <= n - k; i++) {
            boolean[] present = new boolean[51];
            for (int j = i; j < i + k; j++)
                present[nums[j]] = true;
            for (int num = 0; num <= 50; num++)
                if (present[num])
                    freq[num]++;
        }

        int ans = -1;
        for (int num = 0; num <= 50; num++)
            if (freq[num] == 1)
                ans = Math.max(ans, num);

        return ans;
    }
}