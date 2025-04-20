class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count = 0;
        int lastMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num >= lastMax) {
                count++;
                lastMax = num;
            } else {

            }
        }
        return count;
    }
}