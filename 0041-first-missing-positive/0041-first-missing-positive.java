import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int pointer = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pointer) {
                continue;
            } else if (nums[i] == pointer) {
                pointer++;
            } else {
                return pointer;
            }
        }
        return pointer;
    }
}
