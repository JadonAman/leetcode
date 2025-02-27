class Solution {
    public int[] productExceptSelf(int[] nums) {
        long product = 1; 
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }

        if (zeroCount > 1) {
            Arrays.fill(nums, 0); 
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount == 1) {
                if (nums[i] == 0) {
                    nums[i] = (int) product; 
                } else {
                    nums[i] = 0;
                }
            } else {
                if(nums[i] != 0){
                    nums[i] = (int) (product / nums[i]); 
                } else {
                    nums[i] = 0;
                }
            }
        }

        return nums;
    }
}