class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxPositive = 0;
        int maxNegative = 0;
        int currentPositive = 0;
        int currentNegative = 0;

        for (int num : nums) {
            currentPositive = Math.max(0, currentPositive + num);
            maxPositive = Math.max(maxPositive, currentPositive);

            currentNegative = Math.min(0, currentNegative + num);
            maxNegative = Math.min(maxNegative, currentNegative);
        }

        return Math.max(maxPositive, Math.abs(maxNegative));
    }
}