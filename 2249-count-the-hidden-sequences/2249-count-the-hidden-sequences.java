class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long num = 0, min = 0, max = 0;

        for (int val : differences) {
            num += val;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return (int) Math.max(0, (long) upper - lower + 1 - (max - min));
    }
}
