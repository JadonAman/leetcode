class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] freq = new int[100];
        int count = 0;

        for (int[] domino : dominoes) {
            int a = domino[0];
            int b = domino[1];
            int key = Math.min(a, b) * 10 + Math.max(a, b);
            count += freq[key];
            freq[key]++;
        }

        return count;
    }
}
