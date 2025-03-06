class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int counter = 1; 
        int index = 1;    

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter <= 2) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index; 
    }
}
